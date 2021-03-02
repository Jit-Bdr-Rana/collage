package college;
import java.util.List;
import java.io.File;
public interface MemberImporter {
  public List<Member> importMember(File inputFile)throws Exception;
}
