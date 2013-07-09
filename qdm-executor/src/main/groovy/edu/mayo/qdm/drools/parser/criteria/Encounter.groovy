package edu.mayo.qdm.drools.parser.criteria
/**
 */
class Encounter implements Criteria {

    def json
    def valueSetCodeResolver

    @Override
    def toDrools() {
        def valueSetOid = json.code_list_id

        """
        droolsUtil.findMatches("$valueSetOid", \$p.getEncounters()).size() > 0
        """
    }
}
