package klauer.rubyjarit;

import org.jruby.embed.ScriptingContainer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ScriptingContainer container = new ScriptingContainer();
        String script = "require 'rubygems'\nrequre 'sinatra'";
        container.runScriptlet(script);
    }
}
