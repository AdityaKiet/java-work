package com.group.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Core_Member")
public class TeamMember {
	private String groupId;
	private String memberName;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "TeamMember [groupId=" + groupId + ", memberName=" + memberName
				+ "]";
	}

}
