import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing04
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int num = 0, count = 8;

		for (int y = 0; y < 20; y++) {
			if ((y%2) == 0) {
				
				for (int x = 9; x > count; --x) {
					terminal.setCursorPosition(x,y);

					if (((x-count) > ((num+2)/2))) {
						terminal.putCharacter('Y');
					} else {
						terminal.putCharacter('X');
					}
				}
				count--;
				num++;
			}
		}

		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
