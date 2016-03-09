/* Generated By:JavaCC: Do not edit this line. ACBasic.java */
import Data.*;
public class ACBasic implements ACBasicConstants {
  private static DirectorioProcedimientos dirProcedimientos;

  public static void main(String args []) throws ParseException
  {
    ACBasic parser = new ACBasic(System.in);
    while (true)
    {
      System.out.println("Reading from standard input...");
      try
      {
        switch (parser.prog())
        {
          case 0 :
          System.out.println("OK.");
          break;
          case 1 :
          System.out.println("Goodbye.");
          break;
          default :
          break;
        }
      }
      catch (Exception e)
      {
        System.out.println("NOK.");
        System.out.println(e.getMessage());
        parser.ReInit(System.in);
      }
      catch (Error e)
      {
        System.out.println("Oops.");
        System.out.println(e.getMessage());
        break;
      }
    }
  }

  static final public int prog() throws ParseException {
 Token idPrograma;
    jj_consume_token(PROGRAM);
    dirProcedimientos = new DirectorioProcedimientos();
    idPrograma = jj_consume_token(ID);
                Procedimiento programProc = new Procedimiento();
                programProc.setNombreProcedimiento(idPrograma.toString());
                programProc.setTipoProcedimiento("program");
                dirProcedimientos.getProcedimientos().add(programProc);
    jj_consume_token(PYC);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VAR:
      vars();
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case FUNC:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      func();
    }
    main();
                                     {if (true) return 0;}
    throw new Error("Missing return statement in function");
  }

  static final public void tipo() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      jj_consume_token(INT);
      break;
    case FLOAT:
      jj_consume_token(FLOAT);
      break;
    case CHAR:
      jj_consume_token(CHAR);
      break;
    case STRING:
      jj_consume_token(STRING);
      break;
    case BOOL:
      jj_consume_token(BOOL);
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void cte() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CTEI:
      jj_consume_token(CTEI);
      break;
    case CTEF:
      jj_consume_token(CTEF);
      break;
    case TRUE:
      jj_consume_token(TRUE);
      break;
    case FALSE:
      jj_consume_token(FALSE);
      break;
    case CTESTR:
      jj_consume_token(CTESTR);
      break;
    case CTECHAR:
      jj_consume_token(CTECHAR);
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void defarr() throws ParseException {
    jj_consume_token(CORIZQ);
    cte();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMA:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_2;
      }
      jj_consume_token(COMA);
      cte();
    }
    jj_consume_token(CORDER);
  }

  static final public void vars() throws ParseException {
    jj_consume_token(VAR);
    vars1();
    jj_consume_token(PYC);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case CHAR:
      case FLOAT:
      case BOOL:
      case STRING:
      case ARRAY:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_3;
      }
      vars1();
      jj_consume_token(PYC);
    }
  }

  static final public void vars1() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
    case CHAR:
    case FLOAT:
    case BOOL:
    case STRING:
      vars2();
      break;
    case ARRAY:
      vars3();
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void vars2() throws ParseException {
    tipo();
    jj_consume_token(ID);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IGUAL:
      jj_consume_token(IGUAL);
      cte();
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMA:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_4;
      }
      jj_consume_token(COMA);
      jj_consume_token(ID);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IGUAL:
        jj_consume_token(IGUAL);
        cte();
        break;
      default:
        jj_la1[9] = jj_gen;
        ;
      }
    }
  }

  static final public void vars3() throws ParseException {
    jj_consume_token(ARRAY);
    tipo();
    jj_consume_token(ID);
    jj_consume_token(CORIZQ);
    jj_consume_token(CTEI);
    jj_consume_token(CORDER);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IGUAL:
      jj_consume_token(IGUAL);
      defarr();
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
  }

  static final public void func() throws ParseException {
    jj_consume_token(FUNC);
    func1();
    jj_consume_token(ID);
    jj_consume_token(PARIZQ);
    param();
    jj_consume_token(PARDER);
    body();
  }

  static final public void func1() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
    case CHAR:
    case FLOAT:
    case BOOL:
    case STRING:
      tipo();
      break;
    case VOID:
      jj_consume_token(VOID);
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void param() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
    case CHAR:
    case FLOAT:
    case BOOL:
    case STRING:
      param1();
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMA:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_5;
        }
        jj_consume_token(COMA);
        param1();
      }
      break;
    default:
      jj_la1[13] = jj_gen;
      ;
    }
  }

  static final public void param1() throws ParseException {
    tipo();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AMP:
      jj_consume_token(AMP);
      break;
    default:
      jj_la1[14] = jj_gen;
      ;
    }
    jj_consume_token(ID);
  }

  static final public void body() throws ParseException {
    jj_consume_token(LLAIZQ);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VAR:
      vars();
      break;
    default:
      jj_la1[15] = jj_gen;
      ;
    }
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PRINT:
      case READ:
      case WHILE:
      case IF:
      case ID:
        ;
        break;
      default:
        jj_la1[16] = jj_gen;
        break label_6;
      }
      body1();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case RETURN:
      jj_consume_token(RETURN);
      exp();
      jj_consume_token(PYC);
      break;
    default:
      jj_la1[17] = jj_gen;
      ;
    }
    jj_consume_token(LLADER);
  }

  static final public void body1() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      assignllam();
      break;
    case IF:
      cond();
      break;
    case READ:
      read();
      break;
    case PRINT:
      write();
      break;
    case WHILE:
      cycle();
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void assign() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CORIZQ:
      jj_consume_token(CORIZQ);
      exp();
      jj_consume_token(CORDER);
      break;
    default:
      jj_la1[19] = jj_gen;
      ;
    }
    jj_consume_token(IGUAL);
    exp();
    jj_consume_token(PYC);
  }

  static final public void exp() throws ParseException {
    e1();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AND:
    case OR:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        jj_consume_token(AND);
        break;
      case OR:
        jj_consume_token(OR);
        break;
      default:
        jj_la1[20] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      e1();
      break;
    default:
      jj_la1[21] = jj_gen;
      ;
    }
  }

  static final public void e1() throws ParseException {
    e2();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MAYOR:
    case MENOR:
    case MENORIG:
    case MAYORIG:
    case IGUALIG:
    case DIFERENTE:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MENOR:
        jj_consume_token(MENOR);
        break;
      case MAYOR:
        jj_consume_token(MAYOR);
        break;
      case MENORIG:
        jj_consume_token(MENORIG);
        break;
      case MAYORIG:
        jj_consume_token(MAYORIG);
        break;
      case IGUALIG:
        jj_consume_token(IGUALIG);
        break;
      case DIFERENTE:
        jj_consume_token(DIFERENTE);
        break;
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      e2();
      break;
    default:
      jj_la1[23] = jj_gen;
      ;
    }
  }

  static final public void e2() throws ParseException {
    term();
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAS:
      case MENOS:
        ;
        break;
      default:
        jj_la1[24] = jj_gen;
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAS:
        jj_consume_token(MAS);
        break;
      case MENOS:
        jj_consume_token(MENOS);
        break;
      default:
        jj_la1[25] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      term();
    }
  }

  static final public void term() throws ParseException {
    fact();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POR:
      case ENTRE:
        ;
        break;
      default:
        jj_la1[26] = jj_gen;
        break label_8;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POR:
        jj_consume_token(POR);
        break;
      case ENTRE:
        jj_consume_token(ENTRE);
        break;
      default:
        jj_la1[27] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      fact();
    }
  }

  static final public void fact() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NEGACION:
      jj_consume_token(NEGACION);
      break;
    default:
      jj_la1[28] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TRUE:
    case FALSE:
    case CTEI:
    case CTEF:
    case CTESTR:
    case CTECHAR:
      fact1();
      break;
    case PARIZQ:
      fact2();
      break;
    case ID:
      fact3();
      break;
    default:
      jj_la1[29] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void fact1() throws ParseException {
    cte();
  }

  static final public void fact2() throws ParseException {
    jj_consume_token(PARIZQ);
    exp();
    jj_consume_token(PARDER);
  }

  static final public void fact3() throws ParseException {
    jj_consume_token(ID);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CORIZQ:
    case PARIZQ:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CORIZQ:
        fact4();
        break;
      case PARIZQ:
        fact5();
        break;
      default:
        jj_la1[30] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[31] = jj_gen;
      ;
    }
  }

  static final public void fact4() throws ParseException {
    jj_consume_token(CORIZQ);
    exp();
    jj_consume_token(CORDER);
  }

  static final public void fact5() throws ParseException {
    jj_consume_token(PARIZQ);
    exp();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMA:
        ;
        break;
      default:
        jj_la1[32] = jj_gen;
        break label_9;
      }
      jj_consume_token(COMA);
      exp();
    }
    jj_consume_token(PARDER);
  }

  static final public void cond() throws ParseException {
    jj_consume_token(IF);
    jj_consume_token(PARIZQ);
    exp();
    jj_consume_token(PARDER);
    body();
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ELIF:
        ;
        break;
      default:
        jj_la1[33] = jj_gen;
        break label_10;
      }
      jj_consume_token(ELIF);
      jj_consume_token(PARIZQ);
      exp();
      jj_consume_token(PARDER);
      body();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ELSE:
      jj_consume_token(ELSE);
      body();
      break;
    default:
      jj_la1[34] = jj_gen;
      ;
    }
  }

  static final public void write() throws ParseException {
    jj_consume_token(PRINT);
    jj_consume_token(PARIZQ);
    exp();
    jj_consume_token(PARDER);
    jj_consume_token(PYC);
  }

  static final public void read() throws ParseException {
    jj_consume_token(READ);
    jj_consume_token(PARIZQ);
    jj_consume_token(ID);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CORIZQ:
      jj_consume_token(CORIZQ);
      exp();
      jj_consume_token(CORDER);
      break;
    default:
      jj_la1[35] = jj_gen;
      ;
    }
    jj_consume_token(PARDER);
    jj_consume_token(PYC);
  }

  static final public void cycle() throws ParseException {
    jj_consume_token(WHILE);
    jj_consume_token(PARIZQ);
    exp();
    jj_consume_token(PARDER);
    body();
  }

  static final public void llam() throws ParseException {
    jj_consume_token(PARIZQ);
    exp();
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMA:
        ;
        break;
      default:
        jj_la1[36] = jj_gen;
        break label_11;
      }
      jj_consume_token(COMA);
      exp();
    }
    jj_consume_token(PARDER);
    jj_consume_token(PYC);
  }

  static final public void main() throws ParseException {
    jj_consume_token(MAIN);
    jj_consume_token(PARIZQ);
    jj_consume_token(PARDER);
    body();
  }

  static final public void assignllam() throws ParseException {
    jj_consume_token(ID);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PARIZQ:
      llam();
      break;
    case CORIZQ:
    case IGUAL:
      assign();
      break;
    default:
      jj_la1[37] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ACBasicTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[38];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x40,0x80,0x7c00,0x180000,0x8000000,0xfc00,0xfc00,0x0,0x8000000,0x0,0x0,0x7e00,0x8000000,0x7c00,0x1000000,0x40,0x270000,0x2000000,0x270000,0x40000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x180000,0x40000000,0x40000000,0x8000000,0x400000,0x800000,0x40000000,0x8000000,0x40000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x1e0000,0x0,0x0,0x0,0x1,0x0,0x1,0x1,0x0,0x0,0x0,0x0,0x0,0x10000,0x0,0x10000,0x0,0xc00,0xc00,0x1f8,0x1f8,0x3000,0x3000,0xc000,0xc000,0x200,0x1f0002,0x2,0x2,0x0,0x0,0x0,0x0,0x0,0x3,};
   }

  /** Constructor with InputStream. */
  public ACBasic(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ACBasic(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ACBasicTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ACBasic(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ACBasicTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ACBasic(ACBasicTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ACBasicTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 38; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[56];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 38; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 56; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
