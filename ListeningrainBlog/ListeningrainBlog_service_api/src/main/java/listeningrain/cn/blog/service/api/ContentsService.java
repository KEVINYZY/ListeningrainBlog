package listeningrain.cn.blog.service.api;

import listeningrain.cn.blog.input.data.ContentsInputData;
import listeningrain.cn.blog.input.dto.PageInputDTO;
import listeningrain.cn.blog.output.data.ContentsOutputData;
import listeningrain.cn.blog.output.dto.PageOutputDTO;

/**
 * author: listeningrain
 * Date: 2018/9/24
 * Time: 10:24
 * Description:
 */
public interface ContentsService {

    //分页查询
    PageOutputDTO<ContentsOutputData> getContentsByPage(PageInputDTO<ContentsInputData> pageInputDTO);
}