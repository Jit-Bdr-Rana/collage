package college;

import java.io.Writer;

import java.io.IOException;

public interface MemberExporter {
 
	public void writeMember(Writer writer,Member member) throws IOException;
}
