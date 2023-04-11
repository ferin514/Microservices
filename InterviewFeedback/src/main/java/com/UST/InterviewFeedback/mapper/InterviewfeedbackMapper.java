package com.UST.InterviewFeedback.mapper;

import com.UST.InterviewFeedback.dto.InterviewfeedbackDTO;
import com.UST.InterviewFeedback.entity.Interviewfeedback;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface InterviewfeedbackMapper extends GenericMapper<Interviewfeedback, InterviewfeedbackDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    Interviewfeedback asEntity(InterviewfeedbackDTO dto);
}