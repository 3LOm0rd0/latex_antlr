grammar Latex;

DOLLAR: ('$');
STRING: ([a-z] | [A-Z])+;
LICZBA: [0-9]+;

PLUS: ('+');
MINUS: ('-');
MNOZENIE: ('*');
DZIELENIE: ('/');
POTEGA: ('^');
PIERWIASTEK: ('\\sqrt');
ULAMEK: ('\\frac');
DOL: ('_');
LIM: ('\\lim_');
SUMA: ('\\sum');
ILOCZYN: ('\\prod');
CALKA: ('\\int');
P: ('{');
K: ('}');
NL: ('(');
NP: (')');
RARROW: ('\\rightarrow');
SIN: ('\\sin');
COS: ('\\cos');
TG: ('\\tg');
CTG: ('\\ctg');
DX: ('\\, \\mathrm');


dzialanie1: PLUS | MINUS;
dzialanie2: MNOZENIE | DZIELENIE;
dzialanie3: POTEGA | PIERWIASTEK;
dzialanie4: NL | NP;
dzialanie5: COS | SIN | TG | CTG;
//dzialanie6: SUMA;
operacja:
      operacja dzialanie4
    | operacja dzialanie3 P operacja K
    | dzialanie3 P operacja K
    | dzialanie5 (' ') operacja
    | operacja dzialanie2 operacja
    | operacja dzialanie1   operacja

    | MINUS? NL operacja NP
    | MINUS? NL MINUS operacja NP

    | LICZBA
    | STRING (DOL P operacja K)?
    | ULAMEK P operacja K P operacja K
    | MINUS LICZBA
    | MINUS STRING
    | LIM P  operacja (' ') RARROW (' ') operacja K operacja
    | SUMA DOL P operacja ('=') operacja K POTEGA P operacja K
    | ILOCZYN DOL P operacja ('=') operacja K POTEGA P operacja K
    | CALKA (' ')  operacja  DX P  'd' K STRING
    | CALKA DOL P operacja K POTEGA P operacja K (' ')  operacja  DX P  'd' K STRING;
rownanie: DOLLAR operacja ('=') operacja   DOLLAR | DOLLAR operacja DOLLAR;