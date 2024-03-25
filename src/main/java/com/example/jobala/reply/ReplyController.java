package com.example.jobala.reply;

import com.example.jobala._user.User;
import com.example.jobala.board.BoardQueryRepository;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ReplyController {
    private final HttpSession session;
    private final ReplyService replyService;


    @PostMapping("reply/save")
    public String repluSave(ReplyRequest.SaveDTO reqDTO) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        replyService.댓글쓰기(reqDTO,sessionUser);
        return "redirect:/board/" + reqDTO.getBoardId();
    }

    //댓글 삭제
    @PostMapping("reply/{replyId}/delete")
    public String deleteReply(@PathVariable Integer replyId) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        replyService.댓글삭제(replyId,sessionUser.getId());

        return "redirect:/board/"+sessionUser.getId();
    }
}