package Day11;

public class MainStorys extends CollaborativeStoryteller{

    public static void main(String[] args) {
        CollaborativeStoryteller storys = new CollaborativeStoryteller();

        // Add to file
        storys.addStory("its khalid taouti, arkadian", "khalid");
        storys.addStory("its mohamed halif,arkadian", "mohamed");
        storys.addStory("abd lhamid and im also arkadia", "abdlhamid");

        //add votes and branches and illustration
        storys.VoteTo(1);
        storys.VoteTo(2);
        storys.VoteTo(1);
        storys.AddBranches(0, "i'm 25 years old");
        storys.AddBranches(0, "and also i had a master degree in electrical engineering");
        storys.illustrate(0, "presentation arkadians");
        storys.illustrate(1, "candidate of arkx academy");

        // Save
        storys.addToFileAndSer();

        // Load from file .ser
        CollaborativeStoryteller loadedStoryteller = CollaborativeStoryteller.loadFromFile();

        // Print
        for (int i = 0; i < loadedStoryteller.Storys.size(); i++) {
            System.out.println(i + 1 + ". " + loadedStoryteller.Storys.get(i) + " (by " + loadedStoryteller.Authors.get(i) + ")");
            int j=0;
            for (String items : loadedStoryteller.branches.get(i)) {
                System.out.println("branche ["+i+"]["+j+"]: "+items);
                ++j;
            }
            System.out.println("Votes: " + loadedStoryteller.votes.get(i));
            if (loadedStoryteller.illustations.get(i) != null) {
                System.out.println("Illustration: " + loadedStoryteller.illustations.get(i));
            }
        }
    }
}
