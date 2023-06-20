public class Classroom {
    public static void main(String[] args){
        Wilder remy = new Wilder("Remy", true);
        Wilder arturo = new Wilder("Arturo", false);
        Wilder tyler = new Wilder("Tyler", true);

        System.out.println(remy.whoAmI());
        System.out.println(arturo.whoAmI());
        System.out.println(tyler.whoAmI());
    }
}
