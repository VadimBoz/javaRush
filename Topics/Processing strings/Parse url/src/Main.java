import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strUrl = scanner.nextLine();
        
        int i = strUrl.indexOf("?");
        String str = strUrl.substring(i + 1);
        String[] p = str.split("&");
        String pass = "";
        for (String item : p) {
            String[] p1 = item.split("=");
            if (p1[0].equals("pass") ) pass = p1[1];
            if (p1.length >1) System.out.println(p1[0] + " : " + p1[1]);
            else System.out.println(p1[0] + " : " + "not found");
        }
        if (!pass.equals("")) System.out.println("password : " + pass);
    }
}
