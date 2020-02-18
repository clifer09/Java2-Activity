import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing06
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int num = 2, count = 8, c2 = 9;
		String mc = "Merry Christmas!";
		char[] cmc = mc.toCharArray();

		for (int y = 0; y < 19; y++) {
			if ((y%2) == 0) {

				if (y > 1 && y < 19) {
					terminal.setCursorPosition(count+1,y-1);
					terminal.putCharacter('/');
					terminal.setCursorPosition(9,y-1);
					terminal.putCharacter('|');
					terminal.setCursorPosition(c2,y-1);
					terminal.putCharacter('\\');
				}

				for (int x = 9; x <= c2; ++x) {
					terminal.setCursorPosition(x,y);

					if ((x-9) <= ((c2-9)/2)) {
						terminal.putCharacter('Y');
					} else {
						terminal.putCharacter('X');
					}
				}
				
				for (int x = 9; x > count; --x) {
					terminal.setCursorPosition(x,y);

					if (((x-count) > (num/2))){
						terminal.putCharacter('Y');
					} else {
						terminal.putCharacter('X');
					}
				}
				c2++;
				count--;
				num++;
			}

			for (int x = 18, c = 0; x < 34; x++, c++) {
				if (y == 8) {
					terminal.setCursorPosition(x,y);
					terminal.putCharacter(cmc[c]);	
				}	
			}
		}

		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
