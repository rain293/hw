
public class hw3b8 {
    public static void main(String[] args) throws Exception {

        // Bai 8:
        // Nam nay cha 35 tuoi, con 4 tuoi. Tinh xem bao nhieu nam nua tuoi cha gap doi
        // tuoi con.

        // Goi y: Su dung vong lap for i tu 1 den 30. moi vong lap se tang tuoi cua cha
        // va con len 1, sau khi tang se kiem tra tuoi cha co gap doi tuoi con chua, neu
        // da gap doi thi in ra i.

        int x = 35;
        int y = 4;

        for (int i = 0; i <= 30; i++) {

            if (y * 2 == x) {
                System.out.println(i);
                break;
            }

            x += 1;
            y += 1;
        }
    }
}
