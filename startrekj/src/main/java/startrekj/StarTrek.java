package startrekj;

import java.util.Scanner;

public class StarTrek {
	public static void main(String[] args) {
		new StarTrek().run();
	}

	private String A$;

	private Runnable nextRunnable;
	
	private void run() {
		for(nextRunnable = LINE_1; nextRunnable != null; ) {
			nextRunnable.run();
		}
		
	}

	private Runnable LINE_X = new Runnable() {
		public void run() {
		}
	};
	private Runnable LINE_1 = new Runnable() {
		public void run() {
			GOSUB(LINE_5460);
			PRINT("                          STAR TREK ");
			PRINT("DO YOU WANT INSTRUCTIONS (THEY'RE LONG!)");
			A$ = INPUT();
			if (!"YES".equals(A$)) {
				GOTO(LINE_230);
				return;
			}
			GOSUB(LINE_5820);
		}
	};
	private Runnable LINE_230 = new Runnable() {
		public void run() {
		}
	};
	private Runnable LINE_5460 = new Runnable() {
		public void run() {
			for(int i = 1; i <= 11; i++)
				PRINT();
			PRINT();
			return;
		}
	};
	private Runnable LINE_5820 = new Runnable() {
		public void run() {
			PRINT("     INSTRUCTIONS:");
			PRINT("<*> = ENTERPRISE");
			PRINT("+++ = KLINGON");
			PRINT(">!< = STARBASE");
			PRINT(" *  = STAR");
			PRINT("COMMAND 0 = WARP ENGINE CONTROL");
			PRINT("  'COURSE' IS IN A CIRCULAR NUMERICAL          4  3  2");
			PRINT("  VECTOR ARRANGEMENT AS SHOWN.                  \\ ^ /");
			PRINT("  INTERGER AND REAL VALUES MAY BE                \\^/");
			PRINT("  USED.  THEREFORE COURSE 1.5 IS              5 ----- 1");
			PRINT("  HALF WAY BETWEEN 1 AND 2.                      /^\\");
			PRINT("                                                / ^ \\");
			PRINT("  A VECTOR OF 9 IS UNDEFINED, BUT              6  7  8");
			PRINT("  VALUES MAY APPROACH 9.");
			PRINT("                                               COURSE");
			PRINT("  ONE 'WARP FACTOR' IS THE SIZE OF");
			PRINT("  ONE QUADRANT.  THEREFORE TO GET");
			PRINT("  FROM QUADRANT 6,5 TO 5,5 YOU WOULD");
			PRINT("  USE COURSE 3, WARP FACTOR 1");
			PRINT("COMMAND 1 = SHORT RANGE SENSOR SCAN");
			PRINT("  PRINTS THE QUADRANT YOU ARE CURRENTLY IN, INCLUDING");
			PRINT("  STARS, KLINGONS, STARBASES, AND THE ENTERPRISE; ALONG");
			PRINT("  WITH OTHER PERTINATE INFORMATION.");
			PRINT("COMMAND 2 = LONG RANGE SENSOR SCAN");
			PRINT("  SHOWS CONDITIONS IN SPACE FOR ONE QUADRANT ON EACH SIDE");
			PRINT("  OF THE ENTERPRISE IN THE MIDDLE OF THE SCAN.  THE SCAN");
			PRINT("  IS CODED IN THE FORM XXX, WHERE THE UNITS DIGIT IS THE");
			PRINT("  NUMBER OF STARS, THE TENS DIGIT IS THE NUMBER OF STAR-");
			PRINT("  BASES, THE HUNDREDS DIGIT IS THE NUMBER OF KLINGONS.");
			PRINT("COMMAND 3 = PHASER CONTROL");
			PRINT("  ALLOWS YOU TO DESTROY THE KLINGONS BY HITTING HIM WITH");
			PRINT("  SUITABLY LARGE NUMBERS OF ENERGY UNITS TO DEPLETE HIS ");
			PRINT("  SHIELD POWER.  KEEP IN MIND THAT WHEN YOU SHOOT AT");
			PRINT("  HIM, HE GONNA DO IT TO YOU TOO.");
			PRINT("COMMAND 4 = PHOTON TORPEDO CONTROL");
			PRINT("  COURSE IS THE SAME AS USED IN WARP ENGINE CONTROL");
			PRINT("  IF YOU HIT THE KLINGON, HE IS DESTROYED AND CANNOT FIRE");
			PRINT("  BACK AT YOU.  IF YOU MISS, HE WILL SHOOT HIS PHASERS AT");
			PRINT("  YOU.");
			PRINT("   NOTE: THE LIBRARY COMPUTER (COMMAND 7) HAS AN OPTION");
			PRINT("   TO COMPUTE TORPEDO TRAJECTORY FOR YOU (OPTION 2).");
			PRINT("COMMAND 5 = SHIELD CONTROL");
			PRINT("  DEFINES NUMBER OF ENERGY UNITS TO BE ASSIGNED TO SHIELDS");
			PRINT("  ENERGY IS TAKEN FROM TOTAL SHIP'S ENERGY.");
			PRINT("COMMAND 6 = DAMAGE CONTROL REPORT");
			PRINT("  GIVES STATE OF REPAIRS OF ALL DEVICES.  A STATE OF REPAIR");
			PRINT("  LESS THAN ZERO SHOWS THAT THAT DEVICE IS TEMPORARALY");
			PRINT("  DAMAGED.");
			PRINT("COMMAND 7 = LIBRARY COMPUTER");
			PRINT("  THE LIBRARY COMPUTER CONTAINS THREE OPTIONS:");
			PRINT("    OPTION 0 = CUMULATIVE GALACTIC RECORD");
			PRINT("     SHOWS COMPUTER MEMORY OF THE RESULTS OF ALL PREVIOUS");
			PRINT("     LONG RANGE SENSOR SCANS");
			PRINT("    OPTION 1 = STATUS REPORT");
			PRINT("     SHOWS NUMBER OF KLINGONS, STARDATES AND STARBASES");
			PRINT("     LEFT.");
			PRINT("    OPTION 2 = PHOTON TORPEDO DATA");
			PRINT("     GIVES TRAJECTORY AND DISTANCE BETWEEN THE ENTERPRISE");
			PRINT("     AND ALL KLINGONS IN YOUR QUADRANT");
			return;
		}
	};
	private String INPUT() {
		return new Scanner(System.in).nextLine();
	}

	private void PRINT(String text) {
		System.out.println(text);
	}

	private void GOSUB(Runnable runnable) {
		runnable.run();
	}

	private void GOTO(Runnable runnable) {
		nextRunnable = runnable;
	}

	private void PRINT() {
		System.out.println();
	}
}
