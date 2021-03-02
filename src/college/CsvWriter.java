package college;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
import Impl.*;

public class CsvWriter extends MemberFileConverter {
	

	private MemberImporterimpl memberImporter;
	private MemberExporterimpl memberExporter;

	public CsvWriter(MemberImporterimpl memberImporter, MemberExporterimpl memberExporter) {
		this.memberImporter = memberImporter;
		this.memberExporter = memberExporter;
	}

	@Override
	protected MemberExporter getMemberExporter( ) {

		return memberExporter;
	}

	@Override
	protected MemberImporter getMemberImporter( ) {
		return memberImporter;
	}

	@Override
	protected List< Member > getNonDuplicateMembers( List< Member > membersFromFile ) {
		return membersFromFile.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(()->new TreeSet<>(Comparator.comparing(Member::getId))), ArrayList::new));

	}

	@Override
	protected Map< String, List< Member >> splitMembersByState( List< Member > validMembers ) {
		return validMembers.stream().collect(Collectors.groupingBy(Member::getState));

	}

	public static void main( String[] args ) throws Exception {
		new CsvWriter(new MemberImporterimpl(), new MemberExporterimpl()).convert(new File("../SDS_Entry_v2/Members.txt"), "./output/", "outputFile.csv");

	}


}
