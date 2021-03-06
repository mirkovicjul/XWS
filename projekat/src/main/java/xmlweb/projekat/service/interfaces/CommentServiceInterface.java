package xmlweb.projekat.service.interfaces;

import java.util.List;

import xmlweb.projekat.model.dtos.CommentDTO;

/**
 * 
 * @author Nikola
 *
 */
public interface CommentServiceInterface extends ServiceInterface<CommentDTO> {

	public List<CommentDTO> getNotManaged();
	
	public boolean acceptComment(long id, int version);
	
	public boolean rejectComment(long id, int version);
	
}
