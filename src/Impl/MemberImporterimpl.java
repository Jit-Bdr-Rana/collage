package Impl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import college.*;
public class MemberImporterimpl implements MemberImporter{
	@Override
	public List<Member> importMember(File inputFile)throws Exception{
		List<Member> memInfo=new ArrayList<>();
		try(BufferedReader br=new BufferedReader(new FileReader(inputFile))){
			String line=br.readLine();
			while(line!=null) {
				String[] memberInfo=line.split("\\s{2,50}");
				if(memberInfo.length == 7) {
					Member member = new Member();
					member.setId(memberInfo[0]);
					member.setLastName(memberInfo[1]);
					member.setFirstName(memberInfo[2]);
					member.setAddress(memberInfo[3]);
					member.setCity(memberInfo[4]);
					member.setState(memberInfo[5]);
					member.setZip(memberInfo[6]);
					memInfo.add(member);

				}
				line = br.readLine();
				
			}
		}
		return memInfo;
		
	}
}
