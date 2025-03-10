import java.io.*;
/**
 * 문제 번호:
 * 문제 이름:
 * 풀이:
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int test_case = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (test_case-- > 0) {

            sb.append("출력값 : ").append(test_case);

        }

        bw.write(sb.toString());
        bw.flush();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        br.close();
        bw.close();
    }
}