package startrekj;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class StarTrek {
	public static void main(String[] args) {
		new StarTrek().run();
	}

	private STRING C$;
	private STRING D$;
	private STRING E$;
	private STRING A$;
	private STRING Q$;
	private STRING R$;
	private STRING S$;
	private STRING Z$;
	
	private ARRAY_2DIM<Integer> G = new ARRAY_2DIM(8, 8);
	private ARRAY_2DIM C = new ARRAY_2DIM(9, 2);
	private ARRAY_2DIM K = new ARRAY_2DIM(3, 3);
	private ARRAY<Integer> N = new ARRAY<Integer>(3);
	private ARRAY_2DIM Z = new ARRAY_2DIM(8, 8);
	
	private int T0, T, T9, D0, E0, E, P0, P, S9, S, H8, Q1, Q2, S1, S2, T7;
	
	private int B9, K9;
	
	private int I, J;
	
	private double R1;
	
	private int K3;
	
	private int B3;
	
	private int S3;
	
	private int K7;
	
	private double X;
	
	private int Z1, Z2;
	
	private int S8;
	
	private ARRAY<Integer> D = new ARRAY<Integer>(8);

	private Runnable nextRunnable;
	
	private void run() {
		for(Runnable runnable = LINE_1; runnable != null; runnable = nextRunnable) {
			nextRunnable = null;
			runnable.run();
		}
		
	}

	private Runnable LINE_X = new Runnable() {
		public void run() {
		}
	};
	private Runnable LINE_1 = new Runnable() {
		public void run() {
			GOSUB(LINE_5460);
			C$ = new STRING(6);
			D$ = new STRING(72);
			E$ = new STRING(24);
			A$ = new STRING(3);
			Q$ = new STRING(72);
			R$ = new STRING(72);
			S$ = new STRING(48);
			Z$ = new STRING(72);
			PRINT("                          STAR TREK ");
			PRINT("DO YOU WANT INSTRUCTIONS (THEY'RE LONG!)");
			A$.set(INPUT());
			if (!"YES".equals(A$)) {
				GOTO(LINE_230);
				return;
			}
			GOSUB(LINE_5820);
		}
	};
	private Runnable LINE_230 = new Runnable() {
		public void run() {
			Z$.set("                                                                      ");
			GOSUB(LINE_5460);
			T0=T=INT(RND()*20+20)*100;
			T9=30;
			D0=0;
			E0=E=3000;
			P0=P=10;
			S9=200;
			S=H8=0;
			Q1=INT(RND()*8+1);
			Q2=INT(RND()*8+1);
			S1=INT(RND()*8+1);
			S2=INT(RND()*8+1);
			T7=TIM0()+60*TIM1();
			C.set(2,1, -1).set(3,1, -1).set(4,1, -1).set(4,2, -1).set(5,2, -1).set(6,2, -1);
			C.set(1,1, 0).set(1,1, 0).set(1,1, 0).set(1,1, 0).set(1,1, 0);
			C.set(1,2, 1).set(2,2, 1).set(6,1, 1).set(7,1, 1).set(8,1, 1).set(8,2, 1).set(9,2, 1);
			D.setAllTo(0);
			D$.set("WARP ENGINESS.R. SENSORSL.R. SENSORSPHASER CNTRL");
			D$.setWithOneBasedIndex(49, "PHOTON TUBESDAMAGE CNTRL");
			E$.set("SHIELD CNTRLCOMPUTER");
			GOTO(LINE_490);
		}
	};
	private Runnable LINE_490 = new Runnable() {
		public void run() {
			B9=K9=0;
			for(I=1; I<=8; ++I) {
				for(J=1; J<=8; ++J) {
					R1=RND();
					if (R1>.98) {
						K3=3;
						K9=K9+3;
					}
					else if (R1>.95) {
						K3=2;
						K9=K9+2;
					}
					else if (R1>.8) {
						K3=1;
						K9=K9+1;
					}
					else
						K3=0;
					R1=RND();
					if(R1>.96) {
						B3=1;
						B9=B9+1;
					} else
						B3 = 0;
					S3=INT(RND()*8+1);
					G.set(I, J, K3*100+B3*10+S3);
					Z.set(I, J, 0);
				}
			}
			K7=K9;
			if(B9 <= 0 || K9 <= 0) {
				GOTO(LINE_490);
				return;
			}
			PRINT("YOU MUST DESTROY"+K9+" KLINGONS IN"+T9+" STARDATES WITH"+B9+" STARBASES");
			K3=B3=S3=0;
			if(Q1<1 || Q1>8 || Q2<1 || Q2>8) {
				GOTO(LINE_920);
				return;
			}
			X=G.get(Q1,Q2)*0.1;
			K3=INT(X);
			B3=INT((X-K3)*10);
			S3=G.get(Q1,Q2)-INT(G.get(Q1,Q2)*.1)*10;
			if(K3==0 || S>200)
				;
			else {
				PRINT("COMBAT AREA      CONDITION RED");
				PRINT("   SHIELDS DANGEROUSLY LOW");
			}
			K.setAllTo(0);
			for(I=1; I<=3; ++I)
				K.set(I,3, 0);
			Q$=Z$;
			R$=Z$;
			S$=Z$.slice(1,48);
			A$.set("<*>");
			Z1=S1;
			Z2=S2;
			GOSUB(LINE_5510);
		}
	};
	private Runnable LINE_920 = new Runnable() {
		public void run() {
		}
	};
	private Runnable LINE_5510 = new Runnable() {
		public void run() {
			S8=Z1*24+Z2*3-26;
			if (S8>72) {
				if(S8>144) {
					
				}
			} else {
				
				return;
			}
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

	protected int TIM1() {
		return new Date().getMinutes();
	}

	protected int TIM0() {
		return new Date().getSeconds();
	}

	protected double RND() {
		return new Random().nextDouble();
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
	private int INT(double d) {
		return (int) Math.ceil(d);
	}
}
