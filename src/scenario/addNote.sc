theme: /

    state: ДобавлениеЭлемента
        q!: (~добавить|~установить|добавь|запиши|поставь|закинь|~напомнить) 
            [~напоминание|~заметка|~задание|~задача]
            $AnyText::anyText
            
        script:
            log($request)
            log("request.rawRequest")
            log($request.rawRequest)

            addNote($parseTree._anyText, $context);
        
        go!: /ДобавленаНоваяЗапись
