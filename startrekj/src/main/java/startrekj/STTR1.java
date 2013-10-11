package startrekj;

import static startrekj.hpbasic.Line.*;
import static startrekj.hpbasic.functions.ADD.*;
import static startrekj.hpbasic.functions.INT.*;
import static startrekj.hpbasic.functions.MULT.*;
import static startrekj.hpbasic.functions.RND.*;
import static startrekj.hpbasic.functions.SQR.*;
import static startrekj.hpbasic.functions.SUBTRACT.*;
import static startrekj.hpbasic.functions.TIM.*;
import static startrekj.hpbasic.Arithmetic.*;
import static startrekj.hpbasic.operators.EQUAL.*;
import static startrekj.hpbasic.operators.GREATERTHAN.*;
import static startrekj.hpbasic.operators.GREATERTHANOREQUAL.*;
import static startrekj.hpbasic.operators.LESSTHAN.*;
import static startrekj.hpbasic.operators.LESSTHANOREQUAL.*;
import static startrekj.hpbasic.operators.NOTEQUAL_String.*;
import static startrekj.hpbasic.operators.OR.*;
import static startrekj.hpbasic.operators.SUBSTRING.*;
import static startrekj.hpbasic.statements.SET_ArrayPlace.*;
import static startrekj.hpbasic.statements.SET_StringVariable.*;
import static startrekj.hpbasic.statements.SET_NumericVariable.*;
import static startrekj.hpbasic.statements.DEF.*;
import static startrekj.hpbasic.statements.DIM.*;
import static startrekj.hpbasic.statements.DIM$.*;
import static startrekj.hpbasic.statements.EXIT.*;
import static startrekj.hpbasic.statements.FOR.*;
import static startrekj.hpbasic.statements.GOSUB.*;
import static startrekj.hpbasic.statements.GOTO.*;
import static startrekj.hpbasic.statements.IF.*;
import static startrekj.hpbasic.statements.IMAGE.*;
import static startrekj.hpbasic.statements.INPUT.*;
import static startrekj.hpbasic.statements.INPUT_String.*;
import static startrekj.hpbasic.statements.MAT.*;
import static startrekj.hpbasic.statements.NEXT.*;
import static startrekj.hpbasic.statements.PRINT.*;
import static startrekj.hpbasic.statements.PRINT_USING.*;
import static startrekj.hpbasic.statements.REM.*;
import static startrekj.hpbasic.statements.REPLACE.*;
import static startrekj.hpbasic.statements.RETURN.*;
import static startrekj.hpbasic.statements.TRACE.*;
import startrekj.hpbasic.ArrayVariable;
import startrekj.hpbasic.FunctionVariable;
import startrekj.hpbasic.HPBasicProgram;
import startrekj.hpbasic.NumericExpression;
import startrekj.hpbasic.NumericVariable;
import startrekj.hpbasic.StringVariable;
import startrekj.hpbasic.statements.TRACE;

public class STTR1 extends HPBasicProgram {
	
	static NumericVariable A = new NumericVariable("A");
	static NumericVariable B3 = new NumericVariable("B3");
	static NumericVariable B9 = new NumericVariable("B9");
	static NumericVariable D0 = new NumericVariable("D0");
	static NumericVariable E = new NumericVariable("E");
	static NumericVariable E0 = new NumericVariable("E0");
	static NumericVariable H8 = new NumericVariable("H8");
	static NumericVariable I = new NumericVariable("I");
	static NumericVariable J = new NumericVariable("J");
	static NumericVariable K3 = new NumericVariable("K3");
	static NumericVariable K7 = new NumericVariable("K7");
	static NumericVariable K9 = new NumericVariable("K9");
	static NumericVariable P = new NumericVariable("P");
	static NumericVariable P0 = new NumericVariable("P0");
	static NumericVariable Q1 = new NumericVariable("Q1");
	static NumericVariable Q2 = new NumericVariable("Q2");
	static NumericVariable S = new NumericVariable("S");
	static NumericVariable R1 = new NumericVariable("R1");
	static NumericVariable R2 = new NumericVariable("R2");
	static NumericVariable S1 = new NumericVariable("S1");
	static NumericVariable S2 = new NumericVariable("S2");
	static NumericVariable S3 = new NumericVariable("S3");
	static NumericVariable S8 = new NumericVariable("S8");
	static NumericVariable S9 = new NumericVariable("S9");
	static NumericVariable T = new NumericVariable("T");
	static NumericVariable T0 = new NumericVariable("T0");
	static NumericVariable T7 = new NumericVariable("T7");
	static NumericVariable T9 = new NumericVariable("T9");
	static NumericVariable X = new NumericVariable("X");
	static NumericVariable Z1 = new NumericVariable("Z1");
	static NumericVariable Z2 = new NumericVariable("Z2");
	static NumericVariable Z3 = new NumericVariable("Z3");

	static StringVariable A$ = new StringVariable("A$");
	static StringVariable C$ = new StringVariable("C$");
	static StringVariable D$ = new StringVariable("D$");
	static StringVariable E$ = new StringVariable("E$");
	static StringVariable Q$ = new StringVariable("Q$");
	static StringVariable R$ = new StringVariable("R$");
	static StringVariable S$ = new StringVariable("S$");
	static StringVariable Z$ = new StringVariable("Z$");
	
	static ArrayVariable C = new ArrayVariable("C");
	static ArrayVariable D = new ArrayVariable("D");
	static ArrayVariable G = new ArrayVariable("G");
	static ArrayVariable K = new ArrayVariable("K");
	static ArrayVariable N = new ArrayVariable("N");
	static ArrayVariable Z = new ArrayVariable("Z");
	
	static FunctionVariable FND = new FunctionVariable("FND");
	static NumericExpression FND_BODY = new NumericExpression() {

		public Number evaluate() {
			Number KI1 = K.get(I,1);
			Number KI2 = K.get(I, 2);
			Number D1 = subtract(KI1, S1.getValue());
			Number D2 = subtract(KI2, S2.getValue());
			return Math.sqrt(add(mult(D1,D1),mult(D2,D2)).doubleValue());
		}
		public String toString() {
			return "SQR((K[I,1]-S1)^2+(K[I,2]-S2)^2)";
		};
	};
	
	
	public static void main(String[] args) {
	
		STTR1 startrek = new STTR1();
		
		startrek.loadProgramLines();
		System.out.println(startrek);
		startrek.run();
	}

	private void loadProgramLines() {
		addLines(
			line(1, REM("****  HP BASIC PROGRAM LIBRARY  ******************************")),
			line(2, REM()),
			line(3, REM("     STTR1: STAR TREK")),
			line(4, REM("")),
			line(5, REM("      36243  REV B  --  10/73")),
			line(6, REM()),
			line(7, REM("****  CONTRIBUTED PROGRAM  ***********************************"))
		);
		addLines(
			line(100, REM("*****************************************************************")),
			line(110, REM("***                                                           ***")),
			line(120, REM("***     STAR TREK: BY MIKE MAYFIELD, CENTERLINE ENGINEERING   ***")),
			line(130, REM("***                                                           ***")),
			line(140, REM("***        TOTAL INTERACTION GAME - ORIG. 20 OCT 1972")),
			line(150, REM("***                                                           ***")),
			line(160, REM("*****************************************************************"))
		);
		addLines(
			line(169, TRACE(false)),
			line(170, GOSUB(5460))
		);
		addLines(
			line(5460, REM()),
			line(5460, FOR(I).FROM(1).TO(11)),
			line(5470, PRINT("")),
			line(5480, NEXT(I)),
			line(5490, PRINT()),
			line(5500, RETURN())
		);
		addLines(
			line(180, PRINT("                          STAR TREK ")),
			line(190, PRINT("DO YOU WANT INSTRUCTIONS (THEY'RE LONG!)")),
//			line(200, INPUT(A$)),
			line(210, IF(NOTEQUAL(A$, "YES")).THEN(230)),
			line(220, GOSUB(5820))
		);
		addLines(
			line(230, REM("REM *****  PROGRAM STARTS HERE *****")),
			line(240, SET(Z$, "                                                                     ")),
			line(250, GOSUB(5460)),
			line(260, DIM(G,8,8)),
			line(261, DIM(C,9,2)),
			line(262, DIM(K,3,3)),
			line(263, DIM(N,3)),
			line(264, DIM(Z,8,8)),
			line(270, DIM(C$,6)),
			line(271, DIM(D$,72)),
			line(272, DIM(E$,24)),
			line(273, DIM(A$,3)),
			line(274, DIM(Q$,72)),
			line(275, DIM(R$,72)),
			line(276, DIM(S$,48)),
			line(280, DIM(Z$,72)),
			line(290, SET(T0, SET(T, MULT(INT(ADD(MULT(RND(),20),20)),100) ))),
			line(300, SET(T9,20)),
			line(310, SET(D0,0)),
			line(320, SET(E0, SET(E, 3000))),
			line(330, SET(P0, SET(P, 10))),
			line(340, SET(S9, 200)),
			line(350, SET(S, SET(H8,0))),
			line(360, DEF(FND, FND_BODY)),
			line(370, SET(Q1, INT(ADD(MULT(RND(),8),1)) )),
			line(380, SET(Q2, INT(ADD(MULT(RND(),8),1)) )),
			line(390, SET(S1, INT(ADD(MULT(RND(),8),1)) )),
			line(400, SET(S2, INT(ADD(MULT(RND(),8),1)) )),
			line(410, SET(T7, ADD(TIM(0), MULT(60,TIM(1))))),
			line(420, SET(C.at(2,1), C.at(3,1), C.at(4,1), C.at(4,2), C.at(5,2), C.at(6,2)).to(-1)),
			line(430, SET(C.at(1,1), C.at(3,2), C.at(5,1), C.at(7,2), C.at(9,1)).to(0)),
			line(440, SET(C.at(1,2), C.at(2,1), C.at(6,1), C.at(7,1), C.at(8,1), C.at(8,2), C.at(9,2)).to(1)),
			line(450, DIM(D,8)),
			line(451, MAT(D,0)),
			line(460, SET(D$, "WARP ENGINESS.R. SENSORSL.R. SENSORSPHASER CNTRL")),
			line(470, SET(D$, 49, "PHOTON TUBESDAMAGE CNTRL")),
			line(480, SET(E$, "SHIELD CNTRLCOMPUTER")),
			line(490, SET(B9, SET(K9, 0))),
			line(500, FOR(I).FROM(1).TO(8)),
			line(510, FOR(J).FROM(1).TO(8)),
			line(520, SET(R1, RND())),
			line(530, IF(GREATERTHAN(R1,.98)).THEN(580)),
			line(540, IF(GREATERTHAN(R1,.95)).THEN(610)),
			line(550, IF(GREATERTHAN(R1,.8)).THEN(640)),
			line(560, SET(K3,0)),
			line(570, GOTO(660)),
			line(580, SET(K3,3)),
			line(590, SET(K9,ADD(K9,3))),
			line(600, GOTO(660)),
			line(610, SET(K3,2)),
			line(620, SET(K9,ADD(K9,2))),
			line(630, GOTO(660)),
			line(640, SET(K3,1)),
			line(650, SET(K9,ADD(K9,1))),
			line(660, SET(R1,RND())),
			line(670, IF(GREATERTHAN(R1,.96)).THEN(700)),
			line(680, SET(B3,0)),
			line(690, GOTO(720)),
			line(700, SET(B3,1)),
			line(710, SET(B9,ADD(B9,1))),
			line(720, SET(S3,INT(ADD(MULT(RND(),8),1)))),
			line(730, SET(G.at(I,J)).TO(ADD(ADD(MULT(K3,100),MULT(B3,10)),S3))),
			line(740, SET(Z.at(I,J)).to(0)),
			line(750, NEXT(J)),
			line(760, NEXT(I)),
			line(770, SET(K7,K9)),
			line(775, IF(OR(LESSTHANOREQUAL(B9,0),LESSTHANOREQUAL(K9,0))).THEN(490)),
			line(780, PRINT("YOU MUST DESTROY",K9, " KLINGONS IN",T9, " STARDATES WITH",B9," STARBASES")),
			line(810, SET(K3, SET(B3, SET(S3, 0)))),
			line(820, IF(OR(LESSTHAN(Q1,1),OR(GREATERTHAN(Q1,8),OR(LESSTHAN(Q2,1),GREATERTHAN(Q2,8))))).THEN(920)),
			line(830, SET(X,MULT(G.at(Q1,Q2),.01))),
			line(840, SET(K3,INT(X))),
			line(850, SET(B3,INT(MULT(SUBTRACT(X,K3),10)))),
			line(860, SET(S3,SUBTRACT(G.at(Q1,Q2),MULT(INT(MULT(G.at(Q1,Q2),.1)),10)))),
			line(870, IF(EQUAL(K3,0)).THEN(910)),
			line(880, IF(GREATERTHAN(S,200)).THEN(910)),
			line(890, PRINT("COMBAT AREA      CONDITION RED")),
			line(900, PRINT("   SHIELDS DANGEROUSLY LOW")),
			line(910, MAT(K,0)),
			line(920, FOR(I).FROM(1).TO(3)),
			line(930, SET(K.at(I,3)).to(0)),
			line(940, NEXT(I)),
			line(950, SET(Q$,Z$)),
			line(960, SET(R$,Z$)),
			line(970, SET(S$,SUBSTRING(Z$,1,48))),
			line(980, SET(A$,"<*>")),
			line(990, SET(Z1,S1)),
			line(1000, SET(Z2,S2)),
			line(1010, GOSUB(5510)),
			line(1020, FOR(I).FROM(1).TO(K3)),
			line(1030, GOSUB(5380)),
			line(1040, SET(A$,"+++")),
			line(1050, SET(Z1,R1)),
			line(1060, SET(Z2,R2)),
			line(1070, GOSUB(5510)),
			line(1080, SET(K.at(I,1)).TO(R1)),
			line(1090, SET(K.at(I,2)).TO(R2)),
			line(1100, SET(K.at(I,3)).TO(S9)),
			line(1110, NEXT(I)),
			line(1120, FOR(I).FROM(1).TO(B3)),
			line(1130, GOSUB(5380)),
			line(1140, SET(A$,">!<")),
			line(1150, SET(Z1,R1)),
			line(1160, SET(Z2,R2)),
			line(1170, GOSUB(5510)),
			line(1180, NEXT(I)),
			line(1190, FOR(I).FROM(1).TO(S3)),
			line(1200, GOSUB(5380)),
			line(1210, SET(A$," * ")),
			line(1220, SET(Z1,R1)),
			line(1230, SET(Z2,R2)),
			line(1240, GOSUB(5510)),
			line(1250, NEXT(I))
		);
		addLines(
line(1259, PRINT("S1,S2=",S1,",",S2)),
			line(1260, GOSUB(4120)),
//			line(1270, PRINT("COMMAND:")),
//			line(1280, INPUT(A)),
//			line(1290, GOTO(ADD(A,1)).OF(1410,1260,2330,2530,2800,3460,3560,4630)),
			line(1300, EXIT())
		);
		addLines(
			line(1410, PRINT("1410 NOT YET IMPLEMENTED")),
			line(1411, EXIT())
		);
		addLines(
			line(2330, PRINT("2330 NOT YET IMPLEMENTED")),
			line(2331, EXIT())
		);
		addLines(
			line(2530, PRINT("2530 NOT YET IMPLEMENTED")),
			line(2531, EXIT())
		);
		addLines(
			line(2800, PRINT("2800 NOT YET IMPLEMENTED")),
			line(2801, EXIT())
		);
		addLines(
			line(3460, PRINT("3460 NOT YET IMPLEMENTED")),
			line(3461, EXIT())
		);
		addLines(
			line(3560, PRINT("3560 NOT YET IMPLEMENTED")),
			line(3561, EXIT())
		);
		addLines(
			line(4630, PRINT("4630 NOT YET IMPLEMENTED")),
			line(4631, EXIT())
		);
		addLines(
			line(4120, FOR(I).FROM(SUBTRACT(S1,1)).TO(ADD(S1,1))),
			line(4130, FOR(J).FROM(SUBTRACT(S2,1)).TO(ADD(S2,1))),
			line(4140, IF(OR(LESSTHAN(I,1),OR(GREATERTHAN(I,8),OR(LESSTHAN(J,1),GREATERTHAN(J,8))))).THEN(4200)),
			line(4150, SET(A$,">!<")),
			line(4160, SET(Z1,I)),
			line(4170, SET(Z2,J)),
			line(4180, GOSUB(5680)),
			line(4190, IF(EQUAL(Z3,1)).THEN(4240)),
			line(4200, NEXT(J)),
			line(4210, NEXT(I)),
			line(4220, SET(D0,0)),
			line(4230, GOTO(4310)),
			line(4240, SET(D0,1)),
			line(4250, SET(D$, "DOCKED")),
			line(4260, SET(E,3000)),
			line(4270, SET(P,10)),
			line(4280, PRINT("SHIELDS DROPPED FOR DOCKING PURPOSES")),
			line(4290, SET(S,0)),
			line(4300, GOTO(4380)),
			line(4310, IF(GREATERTHAN(K3,0)).THEN(4350)),
			line(4320, IF(LESSTHAN(E,MULT(E0,.1))).THEN(4370)),
			line(4330, SET(C$,"GREEN")),
			line(4340, GOTO(4380)),
			line(4350, SET(C$,"RED")),
			line(4360, GOTO(4380)),
			line(4370, SET(C$,"YELLOW")),
			line(4380, IF(GREATERTHANOREQUAL(D.at(2),0)).THEN(4430)),
			line(4390, PRINT()),
			line(4400, PRINT("*** SHORT RANGE SENSORS ARE OUT ***")),
			line(4410, PRINT()),
			line(4420, GOTO(4530)),
			line(4430, PRINT_USING(4540)),
			line(4440, PRINT_USING(4550,Q$.chunk(1,3),Q$.chunk(4,6),Q$.chunk(7,9),Q$.chunk(10,12),Q$.chunk(13,15),Q$.chunk(16,18),Q$.chunk(19,21),Q$.chunk(22,24))),
			line(4450, PRINT_USING(4560,Q$.chunk(25,27),Q$.chunk(28,30),Q$.chunk(31,33),Q$.chunk(34,36),Q$.chunk(37,39),Q$.chunk(40,42),Q$.chunk(43,45),Q$.chunk(46,48),T)),
			line(4460, PRINT_USING(4570,Q$.chunk(49,51),Q$.chunk(52,54),Q$.chunk(55,57),Q$.chunk(58,60),Q$.chunk(61,63),Q$.chunk(64,66),Q$.chunk(67,69),Q$.chunk(70,72),C$)),
			line(4470, PRINT_USING(4580,R$.chunk(1,3),R$.chunk(4,6),R$.chunk(7,9),R$.chunk(10,12),R$.chunk(13,15),R$.chunk(16,18),R$.chunk(19,21),R$.chunk(22,24),Q1,Q2)),
			line(4480, PRINT_USING(4590,R$.chunk(25,27),R$.chunk(28,30),R$.chunk(31,33),R$.chunk(34,36),R$.chunk(37,39),R$.chunk(40,42),R$.chunk(43,45),R$.chunk(46,48),S1,S2)),
			line(4490, PRINT_USING(4600,R$.chunk(49,51),R$.chunk(52,54),R$.chunk(55,57),R$.chunk(58,60),R$.chunk(61,63),R$.chunk(64,66),R$.chunk(67,69),R$.chunk(70,72),E)),
			line(4500, PRINT_USING(4610,S$.chunk(1,3),S$.chunk(4,6),S$.chunk(7,9),S$.chunk(10,12),S$.chunk(13,15),S$.chunk(16,18),S$.chunk(19,21),S$.chunk(22,24),P)),
			line(4510, PRINT_USING(4620,S$.chunk(25,27),S$.chunk(28,30),S$.chunk(31,33),S$.chunk(34,36),S$.chunk(37,39),S$.chunk(40,42),S$.chunk(43,45),S$.chunk(46,48),S)),
			line(4520, PRINT_USING(4540)),
			line(4530, RETURN())
		);
		addLines(
			line(4540, IMAGE().STRING("---------------------------------")),
			line(4550, IMAGE().FORMAT("8(X,3A)")),
			line(4560, IMAGE().FORMAT("8(X,3A)").FORMAT("8X").STRING("STARDATE").FORMAT("8X").FORMAT("5D")),
			line(4570, IMAGE().FORMAT("8(X,3A)").FORMAT("8X").STRING("CONDITION").FORMAT("8X").FORMAT("6A")),
			line(4580, IMAGE().FORMAT("8(X,3A)").FORMAT("8X").STRING("QUADRANT").FORMAT("9X").FORMAT("D").STRING(",").FORMAT("D")),
			line(4590, IMAGE().FORMAT("8(X,3A)").FORMAT("8X").STRING("SECTOR").FORMAT("11X").FORMAT("D").STRING(",").FORMAT("D")),
			line(4600, IMAGE().FORMAT("8(X,3A)").FORMAT("8X").STRING("ENERGY").FORMAT("9X").FORMAT("6D")),
			line(4610, IMAGE().FORMAT("8(X,3A)").FORMAT("8X").STRING("PHOTON TORPEDOES").FORMAT("3D")),
			line(4620, IMAGE().FORMAT("8(X,3A)").FORMAT("8X").STRING("SHIELDS").FORMAT("8X").FORMAT("6D"))
		);
		addLines(
			line(5380, SET(R1, INT(ADD(MULT(RND(),8),1)))),
			line(5390, SET(R2, INT(ADD(MULT(RND(),8),1)))),
			line(5400, SET(A$,"   ")),
			line(5410, SET(Z1,R1)),
			line(5410, SET(Z2,R2)),
			line(5430, GOSUB(5680)),
			line(5440, IF(EQUAL(Z3,0)).THEN(5380)),
			line(5450, RETURN())
		);
		addLines(
			line(5680, REM("*******  STRING COMPARISON IN QUADRANT ARRAY **********")),
			line(5683, SET(Z1,INT(ADD(Z1,.5)))),
			line(5686, SET(Z2,INT(ADD(Z2,.5)))),
			line(5690, SET(S8,SUBTRACT(ADD(MULT(Z1,24),MULT(Z2,3)),26))),
			line(5700, SET(Z3,0)),
			line(5710, IF(GREATERTHAN(S8,72)).THEN(5750)),
			line(5720, IF(NOTEQUAL(SUBSTRING(Q$,S8,ADD(S8,2)),A$)).THEN(5810)),
			line(5730, SET(Z3,1)),
			line(5740, GOTO(5810)),
			line(5750, IF(GREATERTHAN(S8,144)).THEN(5790)),
			line(5760, IF(NOTEQUAL(SUBSTRING(R$,SUBTRACT(S8,72),SUBTRACT(S8,70)),A$)).THEN(5810)),
			line(5770, SET(Z3,1)),
			line(5780, GOTO(5810)),
			line(5790, IF(NOTEQUAL(SUBSTRING(S$,SUBTRACT(S8,144),SUBTRACT(S8,142)),A$)).THEN(5810)),
			line(5800, SET(Z3,1)),
			line(5810, RETURN())
		);
		addLines(
			line(5510, REM("REM ******  INSERTION IN STRING ARRAY FOR QUADRANT ******")),
			line(5520, SET(S8,SUBTRACT(ADD(MULT(Z1,24),MULT(Z2,3)),26) )),
			line(5530, IF(GREATERTHAN(S8,72)).THEN(5560)),
			line(5540, REPLACE(Q$,S8,ADD(S8,2)).WITH(A$)),
			line(5550, GOTO(5600)),
			line(5560, IF(GREATERTHAN(S8,144)).THEN(5590)),
			line(5570, REPLACE(R$,SUBTRACT(S8,72),SUBTRACT(S8,70)).WITH(A$)),
			line(5580, GOTO(5600)),
			line(5590, REPLACE(S$,SUBTRACT(S8,144),SUBTRACT(S8,142)).WITH(A$)),
			line(5600, RETURN())
		);
		addLines(
			line(5820, PRINT("     INSTRUCTIONS:")),
			line(5830, PRINT("<*> = ENTERPRISE")),
			line(5840, PRINT("+++ = KLINGON")),
			line(5850, PRINT(">!< = STARBASE")),
			line(5860, PRINT(" *  = STAR")),
			line(5870, PRINT("COMMAND 0 = WARP ENGINE CONTROL")),
			line(5880, PRINT("  'COURSE' IS IN A CIRCULAR NUMERICAL          4  3  2")),
			line(5890, PRINT("  VECTOR ARRANGEMENT AS SHOWN.                  \\ ^ /")),
			line(5900, PRINT("  INTERGER AND REAL VALUES MAY BE                \\^/")),
			line(5910, PRINT("  USED.  THEREFORE COURSE 1.5 IS              5 ----- 1")),
			line(5920, PRINT("  HALF WAY BETWEEN 1 AND 2.                      /^\\")),
			line(5930, PRINT("                                                / ^ \\")),
			line(5940, PRINT("  A VECTOR OF 9 IS UNDEFINED, BUT              6  7  8")),
			line(5950, PRINT("  VALUES MAY APPROACH 9.")),
			line(5960, PRINT("                                               COURSE")),
			line(5970, PRINT("  ONE 'WARP FACTOR' IS THE SIZE OF")),
			line(5980, PRINT("  ONE QUADRANT.  THEREFORE TO GET")),
			line(5990, PRINT("  FROM QUADRANT 6,5 TO 5,5 YOU WOULD")),
			line(6000, PRINT("  USE COURSE 3, WARP FACTOR 1")),
			line(6010, PRINT("COMMAND 1 = SHORT RANGE SENSOR SCAN")),
			line(6020, PRINT("  PRINTS THE QUADRANT YOU ARE CURRENTLY IN, INCLUDING")),
			line(6030, PRINT("  STARS, KLINGONS, STARBASES, AND THE ENTERPRISE; ALON")),
			line(6040, PRINT("  WITH OTHER PERTINATE INFORMATION.")),
			line(6050, PRINT("COMMAND 2 = LONG RANGE SENSOR SCAN")),
			line(6060, PRINT("  SHOWS CONDITIONS IN SPACE FOR ONE QUADRANT ON EACH SIDE")),
			line(6070, PRINT("  OF THE ENTERPRISE IN THE MIDDLE OF THE SCAN.  THE SCAN")),
			line(6080, PRINT("  IS CODED IN THE FORM XXX, WHERE THE UNITS DIGIT IS THE")),
			line(6090, PRINT("  NUMBER OF STARS, THE TENS DIGIT IS THE NUMBER OF STAR-")),
			line(6100, PRINT("  BASES, THE HUNDREDS DIGIT IS THE NUMBER OF KLINGONS.")),
			line(6110, PRINT("COMMAND 3 = PHASER CONTROL")),
			line(6120, PRINT("  ALLOWS YOU TO DESTROY THE KLINGONS BY HITTING HIM WITH")),
			line(6130, PRINT("  SUITABLY LARGE NUMBERS OF ENERGY UNITS TO DEPLETE HIS ")),
			line(6140, PRINT("  SHIELD POWER.  KEEP IN MIND THAT WHEN YOU SHOOT AT")),
			line(6150, PRINT("  HIM, HE GONNA DO IT TO YOU TOO.")),
			line(6160, PRINT("COMMAND 4 = PHOTON TORPEDO CONTROL")),
			line(6170, PRINT("  COURSE IS THE SAME AS USED IN WARP ENGINE CONTROL")),
			line(6180, PRINT("  IF YOU HIT THE KLINGON, HE IS DESTROYED AND CANNOT FIRE")),
			line(6190, PRINT("  BACK AT YOU.  IF YOU MISS, HE WILL SHOOT HIS PHASERS AT")),
			line(6200, PRINT("  YOU.")),
			line(6210, PRINT("   NOTE: THE LIBRARY COMPUTER (COMMAND 7) HAS AN OPTION")),
			line(6220, PRINT("   TO COMPUTE TORPEDO TRAJECTORY FOR YOU (OPTION 2)")),
			line(6230, PRINT("COMMAND 5 = SHIELD CONTROL")),
			line(6240, PRINT("  DEFINES NUMBER OF ENERGY UNITS TO BE ASSIGNED TO SHIELDS")),
			line(6250, PRINT("  ENERGY IS TAKEN FROM TOTAL SHIP'S ENERGY.")),
			line(6260, PRINT("COMMAND 6 = DAMAGE CONTROL REPORT")),
			line(6270, PRINT("  GIVES STATE OF REPAIRS OF ALL DEVICES.  A STATE OF REPAIR")),
			line(6280, PRINT("  LESS THAN ZERO SHOWS THAT THAT DEVICE IS TEMPORARALY")),
			line(6290, PRINT("  DAMAGED.")),
			line(6300, PRINT("COMMAND 7 = LIBRARY COMPUTER")),
			line(6310, PRINT("  THE LIBRARY COMPUTER CONTAINS THREE OPTIONS:")),
			line(6320, PRINT("    OPTION 0 = CUMULATIVE GALACTIC RECORD")),
			line(6330, PRINT("     SHOWS COMPUTER MEMORY OF THE RESULTS OF ALL PREVIOUS")),
			line(6340, PRINT("     LONG RANGE SENSOR SCANS")),
			line(6350, PRINT("    OPTION 1 = STATUS REPORT")),
			line(6360, PRINT("     SHOWS NUMBER OF KLINGONS, STARDATES AND STARBASES")),
			line(6370, PRINT("     LEFT.")),
			line(6380, PRINT("    OPTION 2 = PHOTON TORPEDO DATA")),
			line(6390, PRINT("     GIVES TRAJECTORY AND DISTANCE BETWEEN THE ENTERPRISE")),
			line(6400, PRINT("     AND ALL KLINGONS IN YOUR QUADRANT")),
			line(6410, RETURN())
		);
	}
}
