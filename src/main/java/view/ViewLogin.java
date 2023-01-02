package view;

import java.util.Scanner;

public class ViewLogin {
    public ViewLogin(){
    }

    public void meniu(){
        System.out.println("Apasa tasta 1 pentru login");
        System.out.println("Apasa tasta 2 pentru login");
    }

    public void play(){
        Scanner scanner=new Scanner(System.in);
        boolean run=true;
        int alegere=0;
        while(run==true){
            meniu();
            alegere=Integer.parseInt(scanner.nextLine());
            switch(alegere){
                case 1:login();
                break;
            }
        }
    }

    public void login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti usernamel");
        String username=scanner.nextLine();
        System.out.println("Introduceti passwordul");
        String password=scanner.nextLine();
        System.out.println("Logare");
    }
}

/*



    public  void login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti usernameul");
        String username= scanner.nextLine();
        System.out.println("Introduceti passwordul");
        String password=scanner.nextLine();
        System.out.println("Logare");
        Patient logat=repositoryPacient.login(username,password);
        if(logat==null){
            System.out.println("Nu este patient");
        }else {
            Patient patient = repositoryPacient.getPatientById(logat.getId());
            ViewPatient viewPatient = new ViewPatient(patient);
            viewPatient.play();
        }
    }

    public  void logout(){
        System.out.println("Sunteti disconectata");
        String username="";
        String password="";
    }

}

*/
