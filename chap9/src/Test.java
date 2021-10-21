import java.util.Scanner;

public class Test {
    public static int sum = 0;
    private static boolean solution(int sizeOfMatrix, int[][] matrix, int x, int y){
//        for (int i = 0; i < sizeOfMatrix; i++) {
//            for (int j = 0; j < sizeOfMatrix; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        if (x <= -1 || x >=sizeOfMatrix || y <= -1 || y >= sizeOfMatrix) {
            return false;
        }
        if (matrix[x][y] == 1) {
            matrix[x][y] = 0;
            sum++;
            solution(sizeOfMatrix, matrix,x - 1, y);
            solution(sizeOfMatrix, matrix,x, y - 1);
            solution(sizeOfMatrix, matrix,x + 1, y);
            solution(sizeOfMatrix, matrix,x, y + 1);
            if(sum > 0){
                System.out.print(sum + " ");
                sum=0;
            }

            return true;
        }
        return false;

    }




    private static class InputData{
        int sizeOfMatrix;
        int[][] matrix;
    }

    private static InputData processStdin(){
        InputData inputData = new InputData();

        try(Scanner scanner = new Scanner(System.in)){
            inputData.sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+",""));
            inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];
            for(int i = 0; i < inputData.sizeOfMatrix; i++){
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+"," ").split(" ");
                for(int j = 0; j < inputData.sizeOfMatrix; j++){
                    inputData.matrix[i][j] = Integer.parseInt(buf[j]);
                }
            }
        }catch(Exception e){
            throw e;
        }
        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

//        solution(inputData.sizeOfMatrix, inputData.matrix);

        int result = 0;
        for (int i = 0; i < inputData.sizeOfMatrix; i++) {
            for (int j = 0; j < inputData.sizeOfMatrix; j++) {
                if(solution(inputData.sizeOfMatrix, inputData.matrix, i, j))
                    result++;
            }
        }
        System.out.println(result);

    }

}
