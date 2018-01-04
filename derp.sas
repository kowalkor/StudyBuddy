/*
proc sort data=Stat216.Uscrime;
by geog;



proc univariate data=Stat216.Uscrime plot;
var Crime;
run;

proc boxplot data=Stat216.Uscrime;
plot Crime*geog/boxstyle=schematic;
run;


proc sgscatter data=Stat216.Uscrime;
matrix Crime Male Ed Po1 Po2 LF M_F Pop NW U1 U2 Wealth Ineq Prob Time;
run;

proc corr data=Stat216.Uscrime;
var Male Ed Po1 Po2 LF M_F Pop NW U1 U2 Wealth Ineq Prob Time;
with Crime;
run; 

data new;
set Stat216.Uscrime;
north=(geog="north");
south=(geog="south");

proc reg data=new;
model Crime= north south;
run;

proc reg data=Stat216.Uscrime;
model Crime= Po1 Ed LF M_F Pop Prob/vif;
run;


proc reg data=Stat216.Uscrime;
model Crime= Po1;
run;

proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth

proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth prob;
run;

proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth prob pop;
run;

proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth prob Ed;
run;
proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth prob M_F;
run;

proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth prob M_F LF;
run;
data inter;
set Stat216.Uscrime;
interaction = Po1 * Wealth;

proc reg data=inter;
model Crime= Po1 Wealth Prob M_F interaction;
run;

data inter;
set Stat216.Uscrime;
interaction=Po1*Wealth;

proc reg data=inter;
model Crime= Po1 Wealth Prob M_F interaction;
run;

proc reg data=Stat216.Uscrime;
model Crime = Po1 Wealth Prob M_F;
plot residual.*predicted.;
output out=check residual=resids;

proc univariate data=check plot;
var resids;
run;


proc sort data=Stat216.Uscrime;
by geog;


proc freq data=Stat216.Uscrime;
tables geog;
run;

proc boxplot data=Stat216.Uscrime;
plot Crime*geog/boxstyle=schematic;
run;






proc reg data=Stat216.Uscrime;
model Crime = Ed;
run;
proc reg data=Stat216.Uscrime;
model Crime = Po1;
run;

proc reg data=Stat216.Uscrime;
model Crime = Po2;
run;

proc reg data=Stat216.Uscrime;
model Crime = LF;
run;

proc reg data=Stat216.Uscrime;
model Crime = M_F;
run;

proc reg data=Stat216.Uscrime;
model Crime = Pop;
run;

proc reg data=Stat216.Uscrime;
model Crime = Wealth;
run;

proc reg data=Stat216.Uscrime;
model Crime = Prob;
run;

proc reg data=Stat216.Uscrime;
model Crime=Po1/vif;
run;

proc reg data=Stat216.Uscrime; 
run;

proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth Prob/vif;
run;

proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth Prob Pop/vif;
run;

proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth Prob Ed/vif;
run;

proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth Prob M_F/vif;
run;

proc reg data=Stat216.Uscrime;
model Crime=Po1 Wealth Prob M_F LF/vif;
run;




proc reg data=Stat216.Uscrime;
model Crime= Po1 Wealth Prob M_F;
plot residual. *predicted.;
output out=check residual=resids;

proc univariate data=check plot;
var resids;
run;

proc univariate data=Stat216.Uscrime;
var Po1 Wealth Prob M_F;
run;

*/

data new1;
set Stat216.Uscrime END=EOF;
output;
if EOF THEN DO;
	Crime=.; Po1=8.5; Wealth=5253.830; Prob=0.047091; M_F=98.30213;
output;
end;
run;

proc reg data=new1;
model Crime=Po1 Wealth Prob M_F/cli clm;
run;
