import React, { useState } from 'react';
import { List, ListItemButton, ListItemText, styled } from '@mui/material';
import ExpandLess from '@mui/icons-material/ExpandLess';
import ExpandMore from '@mui/icons-material/ExpandMore';

const MuiList = styled(List)({
  width: '100%',
  maxWidth: 1200,
});

const MuiListItemText = styled(ListItemText)({
  fontWeight: 'bold',
});

interface Props {
  title: string;
}

const CandidateDetails = (props: Props) => {
  const [open, setOpen] = useState(true);
  const handleClick = () => {
    setOpen(!open);
  };
  return (
    <>
      <MuiList>
        <ListItemButton onClick={handleClick}>
          <MuiListItemText primary={props.title} />
          {open ? <ExpandLess /> : <ExpandMore />}
        </ListItemButton>
      </MuiList>
    </>
  );
}

export default CandidateDetails;

