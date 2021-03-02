package javaIO;

import java.io.Writer;

public interface memberExporter {

	public void writeMember(Writer writer,member member) throws IOException;
}
