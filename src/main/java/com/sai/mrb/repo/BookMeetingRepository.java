/**
 * 
 */
package com.sai.mrb.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sai.mrb.model.BookMeeting;

/**
 * @author sv
 *
 */
@Repository
public interface BookMeetingRepository extends CrudRepository<BookMeeting, Integer>{

}
