package com.bilgeadam.webexam.model.entity;

import java.io.Serializable;
import java.util.Date;

public interface GenericEntity extends Serializable {

	public abstract Integer getId();

	public abstract Boolean getDeleted();

	public abstract void setDeleted(Boolean deleted);

	public abstract Date getCreatedDate();

	public abstract void setCreatedDate(Date createdDate);

	public abstract Date getUpdatedDate();

	public abstract void setUpdatedDate(Date updatedDate);

	public abstract String getDescription();

	public abstract void setDescription(String description);

}
