import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import java.util.Stack;

public class LanternaStackDemo {
    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<>();
        try (Screen screen = new DefaultTerminalFactory().createScreen()) {
            screen.startScreen();

            for (int i = 1; i <= 4; i++) {
                stack.push("Element " + i);
                redrawStack(screen, stack);
                Thread.sleep(800);
            }

            for (int i = 0; i < 2; i++) {
                stack.pop();
                redrawStack(screen, stack);
                Thread.sleep(800);
            }

            Thread.sleep(2000);
        }
    }

    private static void redrawStack(Screen screen, Stack<String> stack) throws Exception {
        var text = screen.newTextGraphics();
        screen.clear();
        text.setForegroundColor(TextColor.ANSI.WHITE);
        text.setBackgroundColor(TextColor.ANSI.BLUE);
        int row = 2;
        for (String element : stack) {
            text.putString(2, row++, element, SGR.BOLD);
        }
        screen.refresh();
    }
}
