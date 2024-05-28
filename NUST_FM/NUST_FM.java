package NUST_FM;
import java.util.Scanner;
import java.util.LinkedList;

public class NUST_FM {
    public static LinkedList<String> FM_PlayList = new LinkedList<String>();
    public String track;
    public int position;

    public static void play() {

        if (FM_PlayList.isEmpty()){
            System.out.println("PlayList is empty, Please add Songs");
        }
        else{
                for (int i = 0; i < FM_PlayList.size(); i++) {
                    System.out.println(FM_PlayList.get(i) + " is playing");
                }
        }
    }
    public void removeSong(int track){
    this.position = track;
    FM_PlayList.remove(track);
    }
    public void addSong(String track){
    this.track = track;
    FM_PlayList.add(track);
    }
    public boolean SearchSong(String track){
        this.track = track;
        boolean exist = false;
        if(FM_PlayList.contains(track)){
            exist = true;
        }

        return exist;
    }


    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        while(true){
            System.out.println("NUST FM");
            System.out.println("\n[1] Play \n [2] Add A Song \n[3] Remove A Song \n[4] Search A Song \n[5] Exit");
            int choice = user.nextInt();
            while(choice != 5){
                if(choice == 1){
                    play();
                } else if (choice == 2) {
                    System.out.println("Enter name of song: ");
                    String song = user.nextLine();
                    NUST_FM add = new NUST_FM();
                    add.addSong(song);
                } else if (choice == 3) {
                    System.out.println("Enter position of song to delete");
                    int position = user.nextInt();
                    NUST_FM remove = new NUST_FM();
                    remove.removeSong(position);
                }
                else if(choice == 4){
                    System.out.println("Enter name of song to search: ");
                    String song = user.nextLine();
                    NUST_FM search = new NUST_FM();
                    search.SearchSong(song);

                }
            }
        }



    }

}
