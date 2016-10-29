package z1f.study.jaxb;

public class GuildMembership {
	
	private String membershipId;
	private String membershipName;
	
	public String getMembershipId() {
        return this.membershipId;
    }
    public void setMembershipId(final String membershipId) {
        this.membershipId = membershipId;
    }
    
    public String getMembershipName() {
        return this.membershipName;
    }
    public void setMembershipName(final String membershipName) {
        this.membershipName = membershipName;
    }
}