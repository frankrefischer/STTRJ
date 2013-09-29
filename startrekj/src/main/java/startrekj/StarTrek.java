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

	private ARRAY_2DIM<Integer> G = new ARRAY_2DIM<Integer>(8, 8);
	private ARRAY_2DIM<Integer> C = new ARRAY_2DIM<Integer>(9, 2);
	private ARRAY_2DIM<Double> K = new ARRAY_2DIM<Double>(3, 3);
	private ARRAY<Integer> N = new ARRAY<Integer>(3);
	private ARRAY_2DIM<Integer> Z = new ARRAY_2DIM<Integer>(8, 8);

	private int T0, T, T9, D0, E0, E, P0, P, S9, S, H8, Q1, Q2, S1, S2, T7;

	private int B9, K9;

	private int I, J;

	private double R1;

	private double R2;

	private int K3;

	private int B3;

	private int S3;

	private int K7;

	private double X;

	private int Z1, Z2, Z3;
	private double Z1_double, Z2_double;

	private int S8;

	private ARRAY<Integer> D = new ARRAY<Integer>(8);

	private Runnable nextRunnable;

	private void run() {
		for (Runnable runnable = LINE_1; runnable != null; runnable = nextRunnable) {
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
			LINE_5460();
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
			LINE_5820();
		}
	};
	private Runnable LINE_230 = new Runnable() {
		public void run() {
			Z$.set("                                                                      ");
			LINE_5460();
			T0 = T = INT(RND() * 20 + 20) * 100;
			T9 = 30;
			D0 = 0;
			E0 = E = 3000;
			P0 = P = 10;
			S9 = 200;
			S = H8 = 0;
			Q1 = INT(RND() * 8 + 1);
			Q2 = INT(RND() * 8 + 1);
			S1 = INT(RND() * 8 + 1);
			S2 = INT(RND() * 8 + 1);
			T7 = TIM0() + 60 * TIM1();
			C.set(2, 1, -1).set(3, 1, -1).set(4, 1, -1).set(4, 2, -1)
					.set(5, 2, -1).set(6, 2, -1);
			C.set(1, 1, 0).set(1, 1, 0).set(1, 1, 0).set(1, 1, 0).set(1, 1, 0);
			C.set(1, 2, 1).set(2, 2, 1).set(6, 1, 1).set(7, 1, 1).set(8, 1, 1)
					.set(8, 2, 1).set(9, 2, 1);
			D.setAllTo(0);
			D$.set("WARP ENGINESS.R. SENSORSL.R. SENSORSPHASER CNTRL");
			D$.setWithOneBasedIndex(49, "PHOTON TUBESDAMAGE CNTRL");
			E$.set("SHIELD CNTRLCOMPUTER");
			GOTO(LINE_490);
		}
	};
	private Runnable LINE_490 = new Runnable() {
		public void run() {
			B9 = K9 = 0;
			for (I = 1; I <= 8; ++I) {
				for (J = 1; J <= 8; ++J) {
					R1 = RND();
					if (R1 > .98) {
						K3 = 3;
						K9 = K9 + 3;
					} else if (R1 > .95) {
						K3 = 2;
						K9 = K9 + 2;
					} else if (R1 > .8) {
						K3 = 1;
						K9 = K9 + 1;
					} else
						K3 = 0;
					R1 = RND();
					if (R1 > .96) {
						B3 = 1;
						B9 = B9 + 1;
					} else
						B3 = 0;
					S3 = INT(RND() * 8 + 1);
					G.set(I, J, K3 * 100 + B3 * 10 + S3);
					Z.set(I, J, 0);
				}
			}
			K7 = K9;
			if (B9 <= 0 || K9 <= 0) {
				GOTO(LINE_490);
				return;
			}
			PRINT("YOU MUST DESTROY " + K9 + " KLINGONS IN " + T9
					+ " STARDATES WITH " + B9 + " STARBASES");
			K3 = B3 = S3 = 0;
			if (Q1 < 1 || Q1 > 8 || Q2 < 1 || Q2 > 8) {
			} else {
				X = G.get(Q1, Q2) * 0.1;
				K3 = INT(X);
				B3 = INT((X - K3) * 10);
				S3 = G.get(Q1, Q2) - INT(G.get(Q1, Q2) * .1) * 10;
				if (K3 == 0 || S > 200)
					;
				else {
					PRINT("COMBAT AREA      CONDITION RED");
					PRINT("   SHIELDS DANGEROUSLY LOW");
				}
			}
			for (I = 1; I <= 3; ++I)
				K.set(I, 3, 0.0);
			Q$ = Z$;
			R$ = Z$;
			S$ = Z$.slice(1, 48);
			A$.set("<*>");
			Z1 = S1;
			Z2 = S2;
			LINE_5510();
			// 1020
			trace("k3="+K3);
			for (I = 1; I <= K3; ++I) {
				LINE_5380();
				A$.set("+++");
				Z1_double=R1;
				Z2_double=R2;
				LINE_5510();
				K.set(I, 1, R1);
				K.set(I, 2, R2);
				K.set(I, 3, (double)S9);
			}
			// 1120
			for(I=1; I<=B3; ++I) {
				LINE_5380();
				A$.set(">!<");
				Z1_double=R1;
				Z2_double=R2;
				LINE_5510();
			}
			// 1190
			for(I=1; I<=S3; ++I) {
				LINE_5380();
				A$.set(" * ");
				Z1_double=R1;
				Z2_double=R2;
				LINE_5510();
			}
			LINE_4120();
			PRINT("COMMAND:");
			
		}
	};
	private void LINE_4120() {
			for(I=S1-1; I<=S1+1; ++I) {
				for(J=S1-1; J<=S1+1; ++J) {
					if (I<1 || J<1 || J>8)
						;
					else {
						A$.set(">!<");
						Z1=I;
						Z2=J;
						LINE_5680();
						if (Z3==1) {
							LINE_4240();
							return;
						}
					}
				}
			}
			D0=0;
			LINE_4310();
			return;
	};
	private void LINE_4240() {
			D0=1;
			C$.set("DOCKED");
			E=3000;
			P=10;
			PRINT("SHIELDS DROPPED FOR DOCKING PURPOSES");
			S=0;
			LINE_4380();
			return;
	};
	private void LINE_4310() {
			if (K3>0) {
				//4350
				C$.set("RED");
			} else {
				if (E<E0*.1) {
					//4370
					C$.set("YELLOW");
				} else {
					C$.set("GREEN");
				}
			}
			LINE_4380();
			return;
	};
	private void LINE_4380() {
			if (D.get(2) >= 0) {
				PRINT("---------------------------------");
				PRINT_USING_4550(
					Q$.slice(1, 3),
					Q$.slice(4, 6),
					Q$.slice(7, 9),
					Q$.slice(10, 12),
					Q$.slice(13, 15),
					Q$.slice(16, 18),
					Q$.slice(19, 21),
					Q$.slice(22,24)
				);
				PRINT_USING_4560(
					Q$.slice(25,27),
					Q$.slice(28,30),
					Q$.slice(31,33),
					Q$.slice(34,36),
					Q$.slice(37,39),
					Q$.slice(40,42),
					Q$.slice(43,45),
					Q$.slice(46,48),
					T
				);
				PRINT_USING_4570(
					Q$.slice(49,51),
					Q$.slice(52,54),
					Q$.slice(55,57),
					Q$.slice(58,60),
					Q$.slice(61,63),
					Q$.slice(64,66),
					Q$.slice(67,69),
					Q$.slice(70,72),
					C$
				);
				PRINT_USING_4580(
					R$.slice(1,3),
					R$.slice(4,6),
					R$.slice(7,9),
					R$.slice(10,12),
					R$.slice(13,15),
					R$.slice(16,18),
					R$.slice(19,21),
					R$.slice(22,24),
					Q1,
					Q2
				);
				PRINT_USING_4590(
					R$.slice(25,27),
					R$.slice(28,30),
					R$.slice(31,33),
					R$.slice(34,36),
					R$.slice(37,39),
					R$.slice(40,42),
					R$.slice(43,45),
					R$.slice(46,48),
					S1,
					S2
				);
				PRINT_USING_4600(
						R$.slice(49,51),
						R$.slice(52,54),
						R$.slice(55,57),
						R$.slice(58,60),
						R$.slice(61,63),
						R$.slice(64,66),
						R$.slice(67,69),
						R$.slice(70,72),
						E
					);
				PRINT_USING_4610(
					S$.slice(1, 3),
					S$.slice(4, 6),
					S$.slice(7, 9),
					S$.slice(10, 12),
					S$.slice(13, 15),
					S$.slice(16, 18),
					S$.slice(19, 21),
					S$.slice(22,24),
					P
				);
				PRINT_USING_4620(
					S$.slice(25,27),
					S$.slice(28,30),
					S$.slice(31,33),
					S$.slice(34,36),
					S$.slice(37,39),
					S$.slice(40,42),
					S$.slice(43,45),
					S$.slice(46,48),
					S
					);
				PRINT("---------------------------------");
			} else {
				PRINT();
				PRINT("*** SHORT RANGE SENSORS ARE OUT ***");
				PRINT();
			}
	};
//	private Runnable LINE_4380 = new Runnable() {
//		public void run() {
//			if (D.get(2) <= 0)
//		}
//	};
	private void LINE_5380() {
			do {
				R1=INT(RND()*8+1);
				R2=INT(RND()*8+1);
				A$.set("   ");
				Z1_double=R1;
				Z2_double=R2;
				LINE_5680();
			} while(Z3==0);
	};
	private void LINE_5510() {
			S8 = Z1 * 24 + Z2 * 3 - 26;
			if (S8 > 72) {
				// 5560
				if (S8 > 144) {
					// 5590
					S$.replace(S8-144,S8-142, A$);
					return;
				} else {
					// 5570
					R$.replace(S8-72, S8-70, A$);
					return;
				}
			} else {
				return;
			}
	};
	private void LINE_5460() {
			for (int i = 1; i <= 11; i++)
				PRINT();
			PRINT();
			return;
	};
	private void trace(Object msg) {
		System.out.println(msg);
	}
	private void LINE_5680() {
		trace("z1_double="+Z1_double);
		trace("z2_double="+Z2_double);
			Z1=INT(Z1_double+.5);
			Z2=INT(Z2_double+.5);
		trace("z1="+Z1);
		trace("z2="+Z2);
			S8=Z1*24+Z2*3-26;
			trace("s8="+S8);
			
			Z3=0;
			if(S8>72) { // 5750
				if (S8>144) { // 5790
					if (!S$.slice(S8-144,S8-142).equals(A$)) {
						return;
					} else {
						Z3 = 1;
						return;
					}
				} else if (!R$.slice(S8-72, S8-70).equals(A$)) {
					return;
				} else {
					Z3=1;
					return;
				}
			}else if (!Q$.slice(S8, S8+2).equals(A$)) {
				return;
			} else {
				Z3=1;
				return;
			}
	};
	private void LINE_5820() {
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
	private void PRINT_USING_4550(STRING s1, STRING s2, STRING s3, STRING s4, STRING s5, STRING s6, STRING s7, STRING s8) {
		System.out.printf(" %s %s %s %s %s %s %s %s", s1, s2, s3, s4, s5, s6, s7, s8);
	}
	private void PRINT_USING_4560(STRING s1, STRING s2, STRING s3, STRING s4, STRING s5, STRING s6, STRING s7, STRING s8, int t) {
		System.out.printf(" %s %s %s %s %s %s %s %s        STARDATE        %s\n", s1, s2, s3, s4, s5, s6, s7, s8, t);
	}
	private void PRINT_USING_4570(STRING s1, STRING s2, STRING s3, STRING s4, STRING s5, STRING s6, STRING s7, STRING s8, STRING c) {
		System.out.printf(" %s %s %s %s %s %s %s %s        CONDITION        %s\n", s1, s2, s3, s4, s5, s6, s7, s8, c);
	}
	private void PRINT_USING_4580(STRING s1, STRING s2, STRING s3, STRING s4, STRING s5, STRING s6, STRING s7, STRING s8, int q1, int q2) {
		System.out.printf(" %s %s %s %s %s %s %s %s        QUADRANT         %s,%s\n", s1, s2, s3, s4, s5, s6, s7, s8, q1, q2);
	}
	private void PRINT_USING_4590(STRING s1, STRING s2, STRING s3, STRING s4, STRING s5, STRING s6, STRING s7, STRING s8, int ints1, int ints2) {
		System.out.printf(" %s %s %s %s %s %s %s %s        SECTOR           %s,%s\n", s1, s2, s3, s4, s5, s6, s7, s8, ints1, ints2);
	}
	private void PRINT_USING_4600(STRING s1, STRING s2, STRING s3, STRING s4, STRING s5, STRING s6, STRING s7, STRING s8, int e) {
		System.out.printf(" %s %s %s %s %s %s %s %s        ENERGY         %s\n", s1, s2, s3, s4, s5, s6, s7, s8, e);
	}
	private void PRINT_USING_4610(STRING s1, STRING s2, STRING s3, STRING s4, STRING s5, STRING s6, STRING s7, STRING s8, int p) {
		System.out.printf(" %s %s %s %s %s %s %s %s        PHOTON TORPEDOES %s\n", s1, s2, s3, s4, s5, s6, s7, s8, p);
	}
	private void PRINT_USING_4620(STRING s1, STRING s2, STRING s3, STRING s4, STRING s5, STRING s6, STRING s7, STRING s8, int s) {
		System.out.printf(" %s %s %s %s %s %s %s %s        SHIELDS        %s\n", s1, s2, s3, s4, s5, s6, s7, s8, s);
	}
	private int INT(double d) {
		return (int) Math.floor(d);
	}
}
