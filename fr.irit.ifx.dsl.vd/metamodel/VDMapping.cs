SYNTAXDEF VDMapping
FOR <http://irit.fr/vdmapping>
START VDMapping

OPTIONS {
	generateCodeFromGeneratorModel = "true";
	overrideBuilder = "false";
}

TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;

}

TOKENSTYLES {
	"vdmapping" COLOR #7F0055, BOLD;
	"show" COLOR #7F0055, BOLD;
	"as" COLOR #7F0055, BOLD;
	"color" COLOR #7F0055, BOLD;
}


RULES {

	VDMapping   ::= "vdmapping" name[]
		"{" mappings* "}" ;
	
	// syntax definition for class 'AnotherMetaClass'
	Mapping ::= "show" metaclassName[] "as" figureType[] ("(" "color" "=" color[] ")")? ";" ;
}
