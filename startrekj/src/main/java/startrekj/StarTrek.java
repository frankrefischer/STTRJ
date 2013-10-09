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
	private ARRAY_2DIM<Integer> K = new ARRAY_2DIM<Integer>(3, 3);
	private ARRAY<Integer> N = new ARRAY<Integer>(3);
	private int N_int;
	private ARRAY_2DIM<Integer> Z = new ARRAY_2DIM<Integer>(8, 8);

	private int T0, T1, T, T9, D0, E0, E, P0, P, S9, S, H8, Q1, Q2, S1, S2, T7;

	private int B9, K9;

	private int I, J;

	private int R1, R2;

	private double R1_double;

	private int K3;

	private int B3;

	private int S3;

	private int K7;

	private double X, Y;

	private int X_int, Y_int;
	
	private int Z1, Z2, Z3;
	private double Z1_double, Z2_double;

	private int S8;
	
	private int A, C1, C2, W1;
	
	private double H;

	private int X1, X2;
	
	private ARRAY<Integer> D = new ARRAY<Integer>(8);

	private Runnable nextRunnable;

	private void run() {
		for (Runnable runnable = LINE_1; runnable != null; runnable = nextRunnable) {
			nextRunnable = null;
			try {
				runnable.run();
			} catch(ExeceptionalGOTO execeptionalGOTO) {
				nextRunnable = execeptionalGOTO.getNextRunnable();
			}
		}

	}

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
					R1_double = RND();
					if (R1_double > .98) {
						K3 = 3;
						K9 = K9 + 3;
					} else if (R1_double > .95) {
						K3 = 2;
						K9 = K9 + 2;
					} else if (R1_double > .8) {
						K3 = 1;
						K9 = K9 + 1;
					} else
						K3 = 0;
					R1_double = RND();
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
			GOTO(LINE_810);
			return;
		}
	};
	private Runnable LINE_810 = new Runnable() {
		public void run() {
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
				K.set(I, 3, 0);
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
				K.set(I, 1, (int)R1);
				K.set(I, 2, (int)R2);
				K.set(I, 3, S9);
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
			//1270
			line_1270:
			while(true) {
				PRINT("COMMAND:");
				A=INPUT_int();
				if(A+1==1) {
					line_1410:
					while(true) {
						PRINT("COURSE (1-9):");
						C1=INPUT_int();
						if(C1==0)
							continue line_1270;
						if(C1<1 || C1>=9)
							continue line_1410;
						PRINT("WARP FACTOR (0-8):");
						W1=INPUT_int();
						if(W1<0 || W1>8)
							continue line_1410;
						if(D.get(1)>=0 || W1<=.2) {
							//1510
							if(K3>0)
								LINE_3790();
							if(K3>0) {
								if(S<0) {
									LINE_4000();
									throw new RuntimeException("unreachable line reached");
								}
								//-->1610
							} else {
								//1560
								if(E>0) {
								//-->1610
								} else {
									if(S<1) {
										LINE_3920();
										throw new RuntimeException("unreachable line reached");
									} else {
										PRINT("YOU HAVE "+E+" UNITS OF ENERGY");
										PRINT("SUGGEST YOU GET SOME FROM YOUR SHIELDS WHICH HAVE "+S+" UNITS LEFT");
										continue line_1270;
									}
								}
							}
							//1610
							for(I=1; I<=8; ++I) {
								if(D.get(I) >= 0) {
									continue;
								} else {
									D.set(I, D.get(I)+1);
								}
							}
							if(RND()>.2) {
								//-->1810
							} else {
								R1=INT(RND()*8+1);
								if(RND()>=.5) {
									D.set((int)R1, (int)(D.get((int)R1)-(RND()*5+1)));
									PRINT();
									PRINT("DAMAGE CONTROL REPORT:");
									LINE_5610();
									PRINT(" STATE OF REPAIR IMPROVED");
									PRINT();
									//1810
								} else {
									D.set((int)R1, (int)(D.get((int)R1)-(RND()*5+1)));
									PRINT();
									PRINT("DAMAGE CONTROL REPORT:");
									LINE_5610();
									PRINT(" DAMAGED");
									PRINT();
									//-->1810
								}
							}
							//1810
							N_int=INT(W1*8);
							A$.set("   ");
							Z1=S1;
							Z2=S2;
							LINE_5510();
							X=S1;
							Y=S2;
							C2=INT(C1);
							X1=C.get(C2, 1)+(C.get(C2+1,1)-C.get(C2,1))*(C1-C2);
							X2=C.get(C2, 2)+(C.get(C2+1,2)-C.get(C2,2))*(C1-C2);
							for(I=1; I<=N_int; ++I) {
								S1=S1+X1;
								S2=S2+X2;
								if(S1<.5 || S1 >= 8.5 || S2<.5 || S2 >= 8.5) {
									//2170
									X=Q1*8+X+X1*N_int;
									Y=Q2*8+Y+X2*N_int;
									Q1=INT(X/8);
									Q2=INT(Y/8);
									S1=INT(X-Q1*8+.5);
									S2=INT(Y-Q2*8+.5);
									if(S1 != 0) {
										//-->2260
									} else {
										Q1=Q1-1;
										S1=8;
									}
									//2260
									if(S2 != 0) {
										//-->2290
									} else {
										Q2=Q2-1;
										S2=8;
									}
									//2290
									T=T+1;
									E=E-N_int+5;
									if(T>T0+T9) {
										LINE_3970();
										throw new RuntimeException("unreachable line reached");
									} else {
										GOTO(LINE_810);
										throw new RuntimeException("unreachable line reached");
									}

								} else {
									A$.set("   ");
									Z1=S1;
									Z2=S2;
									LINE_5680();
									if(Z3 != 0 ) {
										continue;
									} else {
										PRINT_USING_5370(S1,S2);
										S1=S1-X1;
										S2=S2-X2;
										break;
									}
								}
							}
							//2080
							A$.set("<*>");
							S1=INT(S1+.5);
							S2=INT(S2+.5);
							Z1=S1;
							Z2=S2;
							LINE_5510();
							E=E-N_int+5;
							if(W1<1) {
							} else {
								T=T+1;
							}
							if(T>T0+T9) {
								LINE_3970();
								throw new RuntimeException("unreachable line reached");
							} else {
								GOTO(LINE_810);
								return;
							}
						} else {
							PRINT("WARP ENGINES ARE DAMAGED, MAXIMUM SPEED = WARP .2");
							continue line_1410;
						}
					}
				} else if(A+1==2) {
					//1260
					LINE_4120();
					continue line_1270;
				} else if(A+1==3) {
					//2330
					if(D.get(3) >= 0) {
						PRINT_USING_2350(Q1,Q2);
						PRINT_USING_2520();
						for(I=Q1-1; I<=Q1+1; ++I) {
							N.setAllTo(0);
							for(J=Q2-1; J<=Q2+1; ++J) {
								if(I<1 || I>8 || J<1 || J>8) {
									continue;
								} else  {
									N.set(J-Q2+2, G.get(I,J));
									if(D.get(7)<0) {
										continue;
									} else {
										Z.set(I, J, G.get(I,J));
									}
								}
							}
							//2470
							PRINT_USING_2510(N.get(1), N.get(2), N.get(3));
							PRINT_USING_2520();
						}
						continue line_1270;
					} else {
						PRINT("LONG RANGE SENSORS ARE INOPERABLE");
						continue line_1270;
					}
				} else if(A+1==4) {
					//2530
					if(K3<=0) {
						//3670
						PRINT("SHORT RANGE SENSORS REPORT NO KLINGONS IN THIS QUADRANT");
						continue line_1270;
					} else {
						if (D.get(4) >= 0) {
							line_2570: while(true) {
								if(D.get(7) >= 0 ) {
									//-->2590
								} else {
									PRINT(" COMPUTER FAILURE HAMPERS ACCURACY");
								}
								//2590
								PRINT("PHASERS LOCKED ON TARGET.  ENERGY AVAILABLE="+E);
								PRINT("NUMBER OF UNITS TO FIRE:");
								X_int=INPUT_int();
								if(X_int<=0)
									continue line_1270;
								if(E-X_int<0) {
									continue line_2570;
								}
								break line_2570;
							}
							E=E-X_int;
							LINE_3790();
							if(D.get(7)>=0) {
								//-->2680
							} else {
								X=X_int*RND();
							}
							//2680
							for(I=1; I<=3; ++I) {
								if(K.get(I,3) <= 0) {
									continue;
								} else {
									H=(X/K3/FND())*(2*RND());
									K.set(I,3, (int)(K.get(I,3)-H));
									PRINT_USING_2730(H,K.get(I,1), K.get(I,2), K.get(I,3));
									if(K.get(I, 3)>0) {
										continue;
									} else {
										LINE_3690();
										if(K9 <= 0) {
											LINE_4040();
											throw new RuntimeException("unreachable line reached");
										} else {
											continue;
										}
									}
								}
							}
							if(E<0) {
								LINE_4000();
								throw new RuntimeException("unreachable line reached");
							} else {
								continue line_1270;
							}
						} else {
							PRINT("PHASER CONTROL IS DISABLED");
							continue line_1270;
						}
					}
				} else if(A+1==5) {
					//2800
					if(D.get(5)>=0)
						;
					else {
						PRINT("PHOTON TUBES ARE NOT OPERATIONAL");
						continue line_1270;
					}
					//2830
					if(P>0)
						;
					else {
						PRINT("ALL PHOTON TORPEDOES EXPENDED");
						continue line_1270;
					}
					line_2860: while(true) {
						PRINT("TORPEDO COURSE (1-9):");
						C1=INPUT_int();
						if(C1==0)
							continue line_1270;
						if(C1<1 || C1>=9)
							continue line_2860;
						break;
					}
					C2=INT(C1);
					X1=C.get(C2,1)+(C.get(C2+1,1)-C.get(C2,1)*(C1-C2));
					X2=C.get(C2,2)+(C.get(C2+1,2)-C.get(C2,2)*(C1-C2));
					X_int=S1;
					Y_int=S2;
					P=P-1;
					PRINT("TORPEDO TRACK:");
					line_2960: while(true) {						
						X_int=X_int+X1;
						Y_int=Y_int+X2;
						if(X_int<.5 || X_int>=8.5 || Y_int<.5 || Y_int >= 8.5 ) {
							//-->3420
							LINE_3420();
							continue line_1270;
						}
						PRINT_USING_3000(X,Y);
						A$.set("   ");
						Z1=X_int;
						Z2=Y_int;
						LINE_5680();
						if(Z3==0)
							;
						else
							continue line_2960;
						//3070
						A$.set("+++");
						Z1=X_int;
						Z2=Y_int;
						LINE_5680();
						if(Z3==0) {
							//3220
							A$.set(" * ");
							Z1=X_int;
							Z2=Y_int;
							LINE_5680();
							if(Z3==0)
								;
							else {
								PRINT("YOU CAN'T DESTROY STARS SILLY");
								LINE_3420();
								continue line_1270;
							}
							//3290
							A$.set(">!<");
							Z1=X_int;
							Z2=Y_int;
							LINE_5680();
							if(Z3==0) 
								continue line_2960;
							LINE_3340();
							continue line_1270;
						}
						LINE_3120();
						continue line_1270;
					}
				} else if(A+1==6) {
					//3460
					if(D.get(7)>=0)
						;
					else {
						PRINT("SHIELD CONTROL IS NON-OPERATIONAL");
						continue line_1270;
					}
					line_3490: while(true) {
						PRINT("ENERGY AVAILABLE = "+(E+S)+"   NUMBER OF UNITS TO SHIELDS:");
						X=INPUT_int();
						if(X<=0)
							continue line_1270;
						if(E+S-X<0)
							continue line_3490;
						E=(int)(E+S-X);
						S=(int)X;
						continue line_1270;
					}
				} else if(A+1==7) {
					//3560
					if(D.get(6) >= 0)
						;
					else {
						PRINT("DAMAGE CONTROL REPORT IS NOT AVAILABLE");
						continue line_1270;
					}
					PRINT();
					PRINT("DEVICE        STATE OF REPAIR");
					for(R1=1; R1<=8; ++R1) {
						LINE_5610();
						PRINT(D.get(R1));
					}
					PRINT();
					continue line_1270;
				} else if(A+1==8) {
					//4630
					if(D.get(8) >= 0)
						;
					else {
						PRINT("COMPUTER DISABLED");
						continue line_1270;
					}
					line_4660: while(true) {
						PRINT("COMPUTER ACTIVE AND AWAITING COMMAND");
						A=INPUT_int();
						if(A+1==1) {
							//4740
							PRINT_USING_4750(Q1,Q2);
							PRINT_USING_5330();
							PRINT_USING_5360();
							for(I=1; I<=8; ++I) {
								PRINT_USING_5350(I,Z.get(I, 1),Z.get(I, 2),Z.get(I, 3),Z.get(I, 4),Z.get(I, 5),Z.get(I, 6),Z.get(I, 7),Z.get(I, 8));
								PRINT_USING_5360();
							}
							continue line_1270;
						} else if (A+1==2) {
							//4830
							PRINT("#   STATUS REPORT#");
							PRINT("NUMBER OF KLINGONS LEFT = " +K9);
							PRINT("NUMBER OF STARDATES LEFT = "+((T0+T9)-T));
							PRINT("NUMBER OF STARBASES LEFT = "+B9);
							//3560
							if(D.get(6) >= 0)
								;
							else {
								PRINT("DAMAGE CONTROL REPORT IS NOT AVAILABLE");
								continue line_1270;
							}
							PRINT();
							PRINT("DEVICE        STATE OF REPAIR");
							for(R1=1; R1<=8; ++R1) {
								LINE_5610();
								PRINT(D.get(R1));
							}
							PRINT();
							continue line_1270;
						} else if (A+1==3) {
							//4880
							PRINT();
							H8=0;
							for(I=1; I<=3; ++I) {
								if(K.get(I, 3) <= 0)
									continue;
								C1=S1;
								A=S2;
								W1=K.get(I, 1);
								X=K.get(I,2);
								//5010
								X=X-A;
								A=C1-W1;
								if(X<0) {
									//5130
								} else if(A<0){
									//5190
								} else if(X>0){
									//5070
								} else if(A==0){
									//5150
								}
								C1=1;
								if(ABS(A) <= ABS(X)) {
									//-->5110
								} else {
									PRINT("DIRECTION = " + (C1+(((ABS(A)-ABS(X))+ABS(A))/ABS(A))));
									//5240
									PRINT("DISTANCE = "+(Math.sqrt(X*X+A*A)));
									if(H8==1)
										continue line_1270;
									continue;
								}
							}
							H8=0;
							line_5280: while(true) {
								PRINT("DO YOU WANT TO USE THE CALCULATOR");
								A$.set(INPUT());
								if("YES".equals(A$)) {
									break;
								} else if ("NO".equals(A$)){
									continue line_5280;
								}
								continue line_1270;
							}
							//4970
							PRINT_USING_4980(Q1,Q2,S1,S2);
							PRINT("SHIP'S & TARGET'S COORDINATES ARE");
							C1=INPUT_int();
							A=INPUT_int();
							W1=INPUT_int();
							X=INPUT_int();
							//5010
							X=X-A;
							A=C1-W1;

						}
						PRINT("FUNCTIONS AVAILABLE FROM COMPUTER");
						PRINT("   0 = CUMULATIVE GALACTIC RECORD");
						PRINT("   1 = STATUS REPORT");
						PRINT("   2 = PHOTON TORPEDO DATA");
						continue line_4660;
					}					
				} else {
					PRINT();
					PRINT("   0 = SET COURSE");
					PRINT("   1 = SHORT RANGE SENSOR SCAN");
					PRINT("   2 = LONG RANGE SENSOR SCAN");
					PRINT("   3 = FIRE PHASERS");
					PRINT("   4 = FIRE PHOTON TORPEDOES");
					PRINT("   5 = SHIELD CONTROL");
					PRINT("   6 = DAMAGE CONTROL REPORT");
					PRINT("   7 = CALL ON LIBRARY COMPUTER");
					PRINT();
				}
			}
		}
	};
	private void LINE_3120() {
		PRINT("*** KLINGON DESTROYED ***");
		K3=K3-1;
		K9=K9-1;
		if(K9 <= 0) {
			LINE_4040();
			throw new RuntimeException("unreachable line reached");
		}
		//3160
		for(I=1; I<=3; ++I) {
			if(INT(X+.5) != K.get(I,1))
				continue;
			if(INT(Y+.5) == K.get(I,2))
				break;
		}
		//3200
		K.set(I,3,0);
		//3360
		A$.set("   ");
		Z1=INT(X+.5);
		Z2=INT(Y+.5);
		LINE_5510();
		G.set(Q1,Q2, K3*100+B3*10+S3);
		LINE_3430();
	};
	private void LINE_3340() {
		PRINT("*** STAR BASE DESTROYED ***  .......CONGRATULATIONS");
		B3=B3-1;
		A$.set("   ");
		Z1=INT(X+.5);
		Z2=INT(Y+.5);
		LINE_5510();
		G.set(Q1,Q2, K3*100+B3*10+S3);
		LINE_3430();
	};
	private void LINE_3420() {
		PRINT("TORPEDO MISSED");
		LINE_3430();
		throw new RuntimeException("unreachable line reached");
	}
	private void LINE_3430() {
		LINE_3790();
		if(E<0) {
			LINE_4000();
			throw new RuntimeException("unreachable line reached");
		}
		
	}
	private double FND() {
		double x1 = K.get(I,1)-S1;
		double x2 = K.get(I,2)-S2;
		return Math.sqrt(x1*x1 + x2*x2);
	}
	private void LINE_3690() {
		PRINT_USING_3700(K.get(I,1), K.get(I,2));
		K3=K3-1;
		K9=K9-1;
		A$.set("   ");
		Z1=K.get(I,1);
		Z1=K.get(I,1);
		LINE_5510();
		G.set(Q1, Q2, K3*100+B3*10+S3);
	}
	private void LINE_3790() {
		if(!"DOCKED".equals(C$)) {
			//3820
			if(K3<=0) {
				return;
			} else {
				for(I=1; I<=3; ++I) {
					if(K.get(I, 3)<=0) {
						continue;
					} else {
						H=(K.get(I, 3)/FND())*(2*RND());
						S=S-(int)H;
						PRINT_USING_3880(H,K.get(I,1),K.get(I,2),S);
						if(S<0) {
							LINE_4000();
						} else {
							continue;
						}
					}
				}
				return;
			}
		} else {
			PRINT("STAR BASE SHIELDS PROTECT THE ENTERPRISE");
		}
	};
	private void LINE_3920() {
		PRINT("THE ENTERPRISE IS DEAD IN SPACE.  IF YOU SURVIVE ALL IMPENDING");
		PRINT("ATTACK YOU WILL BE DEMOTED TO THE RANK OF PRIVATE");
		line_3940: while(true) {
			if(K3<=0) {
				LINE_4020();
				throw new RuntimeException("unreachable line reached");
			} else {
				LINE_3790();
			}
			continue line_3940;
		}
	}
	private void LINE_3970() {
		PRINT();
		PRINT("IT IS STARDATE "+T);
		LINE_4020();
		throw new RuntimeException("unreachable line reached");
	}
	private void LINE_4000() {
		PRINT();
		PRINT("THE ENTERPRISE HAS BEEN DESTROYED.  THE FEDERATION WILL BE CONQUERED");
		LINE_4020();
		throw new RuntimeException("unreachable line reached");
	};
	private void LINE_4020() {
		PRINT("THERE ARE STILL "+K9+" KLINGON BATTLE CRUISERS");
		GOTO_230();
		throw new RuntimeException("unreachable line reached");
	};
	private void LINE_4040() {
		PRINT();
		PRINT("THE LAST KLINGON BATTLE CRUISER IN THE GALAXY HAS BEEN DESTROYED");
		PRINT("THE FEDERATION HAS BEEN SAVED !!!");
		PRINT();
		PRINT("YOUR EFFICIENCY RATING = "+((K7/(T-T0))*1000));
		T1=TIM0()+TIM1()*60;
		PRINT("YOUR ACTUAL TIME OF MISSION = "+INT((((T1-T7)*.4)-T7)*100)+" MINUTES ");
		GOTO_230();
		throw new RuntimeException("unreachable line reached");
	};
	private void GOTO_230() {
		throw new ExeceptionalGOTO(LINE_230);
	}
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
	private void LINE_5610() {
		S8=(int)(R1*12-11);
		if(S8>72) {
			PRINT(E$.slice(S8-72, S8-61));
		} else {
			PRINT(D$.slice(S8,S8+11));
		}
	}
	private void LINE_5680() {
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
	private int INPUT_int() {
		try {
			return Integer.valueOf(INPUT());
		} catch(NumberFormatException e) {
			return -1;
		}
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

	private void PRINT(Object text) {
		System.out.println(text);
	}

	private void GOTO(Runnable runnable) {
		nextRunnable = runnable;
	}

	private void PRINT() {
		System.out.println();
	}
	private void PRINT_USING_2350(int q1, int q2) {
		System.out.printf("LONG RANGE SENSOR SCAN FOR QUADRANT %s,%s\n", q1, q2);
	}
	private void PRINT_USING_2510(int n1, int n2, int n3) {
		System.out.printf(": %s :%s :%s\n", n1, n2, n3);
	}
	private void PRINT_USING_2520() {
		System.out.printf("-----------------\n");
	}
	private void PRINT_USING_2730(double hit, Integer s1, Integer s2, Integer left) {
		System.out.printf("%s UNIT HIT ON KLINGON AT SECTOR %s,%s   (%s LEFT)\n", hit, s1, s2, left);
	}
	private void PRINT_USING_3000(double x, double y) {
		System.out.printf("               %s,%s\n", x, y);
	}
	private void PRINT_USING_3700(double s1, double s2) {
		System.out.printf("KLINGON AT SECTOR ",D,",",D," DESTROYED ****\n", s1, s2);
	}
	private void PRINT_USING_3880(double hit, int s1, int s2, int left) {
		System.out.printf("%s UNIT HIT ON ENTERPRISE AT SECTOR %s,%s   (%s LEFT)\n", hit, s1, s2, left);
	}
	private void PRINT_USING_4550(STRING s1, STRING s2, STRING s3, STRING s4, STRING s5, STRING s6, STRING s7, STRING s8) {
		System.out.printf(" %s %s %s %s %s %s %s %s\n", s1, s2, s3, s4, s5, s6, s7, s8);
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
	private void PRINT_USING_4750(int q1, int q2) {
		System.out.printf("COMPUTER RECORD OF GALAXY FOR QUADRANT 5s,%s\n", q1, q2);
	}
	private void PRINT_USING_4980(int q1, int q2, int s1, int s2) {
		System.out.printf("YOU ARE AT QUADRANT ( %s,%s )  SECTOR ( %s,%s )\n", q1, q2, s1, s2);
	};
	private void PRINT_USING_5330() {
		System.out.printf("     1     2     3     4     5     6     7     8\n");
	}
	private void PRINT_USING_5350(int i, int z1, int z2, int z3, int z4, int z5, int z6, int z7, int z8) {
		System.out.printf("%s   %s   %s   %s   %s   %s   %s   %s   %s\n", i, z1, z2, z3, z4, z5, z6, z7, z8);
	}
	private void PRINT_USING_5360() {
		System.out.printf("   ----- ----- ----- ----- ----- ----- ----- -----\n");
	}
	private void PRINT_USING_5370(int s1, int s2) {
		System.out.printf(" WARP ENGINES SHUTDOWN AT SECTOR %s,%s DUE TO BAD NAVIGATION\n", s1, s2);
	}
	private int INT(double d) {
		return (int) Math.floor(d);
	}
	private double ABS(double d) {
		return (int) Math.abs(d);
	}
}
