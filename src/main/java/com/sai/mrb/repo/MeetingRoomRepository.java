/**
 * 
 */
package com.sai.mrb.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sai.mrb.model.MeetingRoom;

/**
 * @author sv
 *
 */

@Repository
public interface MeetingRoomRepository extends CrudRepository<MeetingRoom, Integer>{

}
