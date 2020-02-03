import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing05
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int num = 0, count = 8;

		for (int y = 0; y < 19; y++) {
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
			} else {
					terminal.setCursorPosition(9,y);
					terminal.putCharacter('|');
			}
		}

		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
