/* generated from model null*/
/* generated by template symboltable.ModelNameCalculator*/

package javascript._symboltable;

import java.util.Optional;

import de.se_rwth.commons.Names;

public class JavaScriptModelNameCalculator extends JavaScriptModelNameCalculator {

  @Override protected Optional<String> calculateModelNameForState(String name) {
    // e.g., if p.Automaton.State, return p.Automaton
    if (!Names.getQualifier(name).isEmpty()) {
      return Optional.of(Names.getQualifier(name));
    }

    return Optional.empty();
  }
}
