package parser.mod;

public interface JavaParserService {

    JavaParsingResult parse(JavaParserArg arg);

    void stop();
}
