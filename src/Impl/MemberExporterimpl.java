package Impl;
import java.io.IOException;
import java.io.Writer;

import college.*;
public class MemberExporterimpl implements MemberExporter {

	public void writeMember(Writer writer,Member member) throws IOException{
		writer.write( member.toCSVString( member ) );
	}
}
