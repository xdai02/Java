public class TellStory {
    public static void main(String[] args) {
        tellStory();
    }

    public static void tellStory() {
        String story;
        story += "从前有座山，山里有座庙\n";
        story += "庙里有个老和尚\n";
        story += "老和尚在对小和尚讲故事：";
        System.out.println(story);

        tellStory();
    }
}
