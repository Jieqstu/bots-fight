package com.bf.backend.service.impl.user.bot;

import com.bf.backend.mapper.BotMapper;
import com.bf.backend.pojo.Bot;
import com.bf.backend.pojo.User;
import com.bf.backend.service.impl.utils.UserDetailsImpl;
import com.bf.backend.service.user.bot.RemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RemoveServiceImpl implements RemoveService {
    @Autowired
    private BotMapper botMapper;

    @Override
    public Map<String, String> remove(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();

        int bot_id = Integer.parseInt(data.get("bot_id"));
        Bot bot = botMapper.selectById(bot_id);
        Map<String, String> map = new HashMap<>();

        if (bot == null) {
            map.put("error_message", "Bot doesn't exist");
            return map;
        }

        if (!bot.getUserId().equals(user.getId())) {
            map.put("error_message", "No authority to delete this bot");
            return map;
        }

        botMapper.deleteById(bot_id);

        map.put("error_message", "success");
        return map;
    }
}
