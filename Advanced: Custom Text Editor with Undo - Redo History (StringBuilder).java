import java.util.Stack;

public class MiniTextEditor {
    private final StringBuilder document;
    private final Stack<String> undoStack;

    public MiniTextEditor() {
        this.document = new StringBuilder();
        this.undoStack = new Stack<>();
    }

    public void appendText(String text) {
        saveState();
        document.append(text);
    }

    public void insertAt(int index, String text) {
        if (index >= 0 && index <= document.length()) {
            saveState();
            document.insert(index, text);
        }
    }

    public void deleteRange(int start, int end) {
        if (start >= 0 && end <= document.length() && start < end) {
            saveState();
            document.delete(start, end);
        }
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            // Clear current builder and restore previous snapshot
            document.setLength(0);
            document.append(undoStack.pop());
        } else {
            System.out.println("[Nothing to undo]");
        }
    }

    private void saveState() {
        undoStack.push(document.toString());
    }

    public String getContent() {
        return document.toString();
    }

    public static void main(String[] args) {
        MiniTextEditor editor = new MiniTextEditor();

        editor.appendText("Java programming is fun.");
        System.out.println("Step 1: " + editor.getContent());

        editor.insertAt(5, "modern ");
        System.out.println("Step 2: " + editor.getContent());

        editor.deleteRange(27, 30); // Deletes "fun"
        editor.appendText("powerful!");
        System.out.println("Step 3: " + editor.getContent());

        editor.undo();
        System.out.println("Undo 1: " + editor.getContent());

        editor.undo();
        System.out.println("Undo 2: " + editor.getContent());
    }
}
