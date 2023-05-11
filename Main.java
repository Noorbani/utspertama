class Main {
    public static void main(String[] args) {

        Mhs mhs = new mhs(username:"ini_username", password:"ini_password");

        mhs.setWarna(nama:"noor bani adam");
        mhs.setNim(nim:"g111190025");
        mhs.setSmt(smt:8);

        System.out.println("Nama Mhs: " +  mhs.getNama());
        System.out.println("Nim Mhs: "  + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());
        System.out.println("Username: " + mhs.getUsername());
        System.out.println("password: " + mhs.getpassword());


    }
}