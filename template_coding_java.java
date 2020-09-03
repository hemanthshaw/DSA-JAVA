     
    import java.util.*;
    import java.io.*;
     
    public class cf222b {
     
        public static void main(String[] args) throws Exception {
     
    //        Scanner in = new Scanner(System.in);
            FastReader in = new FastReader();
            PrintWriter out = new PrintWriter(System.out);
            int n = in.nextInt();
            int m = in.nextInt();
            int q = in.nextInt();
     
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
     
                for (int j = 0; j < m; j++) {
     
                    a[i][j] = in.nextInt();
     
                }
     
            }
     
            int[] r = new int[n];
            int[] c = new int[m];
     
            for (int i = 0; i < n; i++) {
     
                r[i] = i;
     
            }
     
            for (int i = 0; i < m; i++) {
     
                c[i] = i;
     
            }
     
     
            for (int i = 0; i < q; i++) {
     
                char qq = in.next().charAt(0);
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
     
                if (qq == 'r') {
     
                    int tmp = r[x];
                    r[x] = r[y];
                    r[y] = tmp;
     
                } else if (qq == 'c') {
                    int tmp = c[x];
                    c[x] = c[y];
                    c[y] = tmp;
                } else {
     
                    out.println(a[r[x]][c[y]]);
     
                }
     
     
     
     
     
            }
     
     
            out.flush();
            out.close();
     
     
        }
        static class FastReader {
            BufferedReader br;
            StringTokenizer st;
            FastReader() {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
            FastReader(File f) {
                try {
                    br = new BufferedReader(new FileReader(f));
                } catch (FileNotFoundException x) {
                    System.out.println(x);
                }
            }
            String next() throws IOException {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                return st.nextToken();
            }
            String nextLine() throws IOException {
                return br.readLine();
            }
     
            int nextInt() throws IOException {
                return Integer.parseInt(next());
            }
            long nextLong() throws IOException {
                return Long.parseLong(next());
            }
            double nextDouble() throws IOException {
                return Double.parseDouble(next());
            }
            boolean hasNext() throws IOException {
                String s = br.readLine();
                if (s == null) {
                    return false;
                }
                st = new StringTokenizer(s);
                return true;
            }
        }
     
     
    }