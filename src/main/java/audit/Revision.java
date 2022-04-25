package audit;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.RevisionEntity;

import config.CustomRevisionListener;
import lombok.Data;

@Entity
@Table(name="REVISION_INFO")
@RevisionEntity(CustomRevisionListener.class)
@Data
public class Revision {

}
