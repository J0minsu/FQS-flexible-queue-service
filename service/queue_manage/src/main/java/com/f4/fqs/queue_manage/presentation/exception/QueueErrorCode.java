package com.f4.fqs.queue_manage.presentation.exception;

import com.f4.fqs.commons.domain.exception.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum QueueErrorCode implements ErrorCode {
    // Common
    INVALID_INPUT_VALUE(400, "COMMON_0001", "잘못된 입력 값입니다."),
    INTERNAL_SERVER_ERROR(500, "COMMON_002", "서버 에러입니다."),

    // Security
    NOT_AUTHORIZATION(403, "SECURITY_001", "권한이 없습니다."),

    // Queue
    QUEUE_NAME_DUPLICATE(409, "QUEUE_001", "이미 존재하는 대기열 이름입니다."),
    QUEUE_NOT_FOUND(404, "QUEUE_002", "존재하지 않는 대기열입니다."),
    QUEUE_USER_NOT_MATCHED(403, "QUEUE_003", "해당 대기열의 root 사용자가 아닙니다."),
    QUEUE_PORT_NOT_EXITED(410, "QUEUE_004", "더이상 허용 가능한 포트가 존재하지 않습니다."),
    INVALID_QUEUE_NAME_PATTERN(411, "QUEUE_005", "큐 이름은 영문(대, 소문자), 숫자, 하이푼(-) 으로만 구성 가능합니다."),

    ;

    private final int status;
    private final String code;
    private final String message;
}
