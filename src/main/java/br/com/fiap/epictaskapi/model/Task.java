package br.com.fiap.epictaskapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Task {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @NotBlank
  private String title;
  @Size(min = 10, message = "melhore essa descrição")
  private String description;
  private int score = 100;
  private int status = 0;

  public Task(String title, String description) {
    this.title = title;
    this.description = description;
  }
  
  public Task() {
		super();
	}

	public Task(String title, String description, int score, int status) {
		super();
		
		this.title = title;
		this.description = description;
		this.score = score;
		this.status = status;
	}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public int getScore() {
    return score;
  }
  public void setScore(int score) {
    this.score = score;
  }
  public int getStatus() {
    return status;
  }
  public void setStatus(int status) {
    this.status = status;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + score;
    result = prime * result + status;
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Task other = (Task) obj;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (score != other.score)
      return false;
    if (status != other.status)
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Task [description=" + description + ", id=" + id + ", score=" + score + ", status=" + status + ", title="
        + title + "]";
  }

  
}
