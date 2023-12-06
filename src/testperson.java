public class testperson {
    public static void main(String[] args) {
        person p=new person();
        p.setFirstName("Hachem");
        System.out.println("votre prenom est: "+p.firstName);
        p.setName("Bayeoui");
        System.out.println("votre nom est: "+p.name);
        p.setDateNaiss(15,3,2000);
        System.out.println(p.firstName+" "+p.name+" votre age est "+p.ageEn2023());
    }
}