import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing03
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int num = 0;

		for (int y = 0; y < 20; y++) {
			if ((y%2) == 0) {
				
				for (int x = 0; x <= num; ++x) {
					terminal.setCursorPosition(x,y);

					if (x <= (num/2)){
						terminal.putCharacter('X');
					} else {
						terminal.putCharacter('Y');
					}
				}
				num++;
			}
		}

		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
