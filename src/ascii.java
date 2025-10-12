public class ascii {
    public static final int MOUSE_WIDTH = 8;
    public static final int MOUSE_HEIGHT = 9;

    public static void main(String[] args) {
        char[][] mouse = getmouse();

        for (int y = 0; y < MOUSE_HEIGHT; y++) {
            for (int x = 0; x < MOUSE_WIDTH; x++) {
                System.out.print(mouse[y][x]);
            }
            System.out.println();
        }
    }

  static char[][] getmouse() {
        char[][] img = new char[MOUSE_HEIGHT][MOUSE_WIDTH];
        // fill with empty space
        for (int y = 0; y < MOUSE_HEIGHT; y++) {
            for (int x = 0; x < MOUSE_WIDTH; x++) {
                img[y][x] = ' ';
            }
        }
        // then fill individual characters
        img[0][3] = '^';
        img[0][6] = '^';
        img[1][2] = '/';
        img[1][3] = '/';
        img[1][4] = '-';
        img[1][5] = '\\';
        img[1][6] = '\\';
        img[2][2] = '(';
        img[2][3] = '-';
        img[2][4] = '╥';
        img[2][5] = '-';
        img[2][6] = ')';
        img[3][3] = '-';
        img[3][4] = '╥';
        img[3][5] = '-';
        img[4][0] = '^';
        img[4][3] = '-';
        img[4][4] = '╥';
        img[4][5] = '-';
        img[4][8] = '^';
        img[5][0] = '/';
        img[5][1] = '(';
        img[5][7] = ')';
        img[5][8] = '\\';
        img[6][3] = '/';
        img[6][5] = '\\';
        img[7][2] = '(';
        img[7][3] = '@';
        img[7][4] = '^';
        img[7][5] = '@';
        img[7][6] = ')';
        img[8][2] = '●';
        img[8][3] = '-';
        img[8][4] = '-';
        img[8][5] = '-';
        img[8][6] = '●';


        return img;
    }   
   









}
