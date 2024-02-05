package Day11;
import java.io.*;
import java.util.*;
public class CollaborativeStoryteller  implements Serializable{
    protected static final String StoryFile="C:\\Users\\user\\IdeaProjects\\arkx_java\\src\\Day11\\story.txt";
    protected static final String SerFile="C:\\Users\\user\\IdeaProjects\\arkx_java\\src\\Day11\\storys.ser";
    protected List<String> Storys= new ArrayList<>();
    protected List<String> Authors= new ArrayList<>();

    protected List<Integer> votes= new ArrayList<>();
    protected List<List<String>> branches= new ArrayList<>();
    protected List<String> illustations= new ArrayList<>();
    protected void addStory(String story, String player){
        Storys.add(story);
        Authors.add(player);
        votes.add(0);
        branches.add(new ArrayList<>());
        illustations.add(null);
        addToFileAndSer();
    }
    protected void VoteTo(int index){
        votes.add(index, votes.get(index)+1);
        addToFileAndSer();
    }
    protected void AddBranches(int index, String statement){
        branches.get(index).add(statement);
        addToFileAndSer();
    }
    protected void illustrate(int index, String statement){
        illustations.set(index,statement);
        addToFileAndSer();
    }
    protected void addToFileAndSer(){
        try (PrintWriter writer = new PrintWriter(new FileWriter(StoryFile))){
           for (int i = 0; i < Storys.size(); i++) {
                writer.println(i + 1 + ". " + Storys.get(i) + " (by " + Authors.get(i) + ")");
                int j=0;
                for(String items: branches.get(i)){
                    writer.println("branche ["+i+"]["+j+"]"+items);
                    j++;
                }
                writer.println("number of votes: "+ votes.get(i));
                if (illustations.get(i) != null) {
                    writer.println("illustration: " + illustations.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream objectSer = new ObjectOutputStream(new FileOutputStream(SerFile))){
            objectSer.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static CollaborativeStoryteller loadFromFile() {
        try (ObjectInputStream OSer = new ObjectInputStream(new FileInputStream(SerFile))) {
            return (CollaborativeStoryteller) OSer.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new CollaborativeStoryteller();
        }
    }
}
